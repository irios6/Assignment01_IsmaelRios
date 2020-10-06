package cse360assignment02;

public class AddingMachine {
	private int total; //declare total
	private String history = "0"; //declare and initialize history to a string containing 0
  
	//constructor
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
  
	public int getTotal () {
		return total; //return the current total
	}
  
	public void add (int value) {
		total = total + value; //update total
		history += " + " + value; //update history
	}

	public void subtract (int value) {
		total = total - value; //update total
		history += " - " + value; //update history
	}

	public String toString () {
		return history; //return string containing the history of the add/subtract calculations
	}

	public void clear() {
		history = null; //clear "memory"
	}
	
	//test functions
	public static void main(String[] args) {
		AddingMachine machine = new AddingMachine(); //create AddingMachine object
		
		machine.add(4); //call add to add 4 
		machine.subtract(2); //call subtract to subtract 2
		machine.add(5); //call add to add 5
		
		System.out.println(machine.toString()); //call toString() to print out history
		machine.clear(); //call clear() to clear "memory"
	} 
}//end of AddingMachine class