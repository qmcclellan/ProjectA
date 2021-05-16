package main;

import java.util.Scanner;

/*
 * This program is to create a liquid measurement converter
 * 
 * 
 */

public class Converter {
	
	//Variables of the class
	
	private double ounce = 1;
	private double cup = 8;
	private double pint = 16;
	private double quart = 32;
	private double gallon = 128;

	// Simple Class Constructor Prints First Message to Screen
	public Converter() {
		System.out.println("Please Select First Unit");

	}

	// menu method used to print the menu to the screen
	public void menu() {

		String menu = "1. Oz \n" + "2. cup \n" + "3. pint \n" + "4. quart \n" + "5. gallon \n"+"6. quit \n";

		System.out.println(menu);

	}

	/*
	 * Get Selection from user input to scanner Sets input into String uses while
	 * statement to check if scanner is empty if it isn't empty switches to the case
	 * provided
	 */

	public String menuSelection(Scanner scanner) {

		String measurement = scanner.next();

		//Used to test if user has made input
		while (!measurement.isEmpty()) {

			switch (measurement) { //Test the input for measurment selection

			case "1": {
				return "oz";

			}

			case "2": {
				return "cup";

			}

			case "3": {
				return "pint";

			}

			case "4": {
				return "quart";

			}

			case "5": {
				return "gallon";

			}
			
			case "6": {
				System.exit(0);

			}

			default: {
				return "Selection Not Found!";
			}

			}//end switch
		}//end while
		return "Selection Not Found!";
	}

	// used to do the conversion of one unit to another

	public void conversion(double qty, String unit1, String unit2) {

		double total = 0;

		switch (unit1.trim()) {// main switch statement

		case "oz": {
			switch (unit2.trim()) {// Nested switch statement

			case "oz": {
				total = qty * ounce;
				break;

			}

			case "cup": {

				total = qty * ounce / cup;
				break;
			}

			case "pint": {

				total = qty * ounce / pint;
				break;
			}

			case "quart": {

				total = qty * ounce / quart;
				break;

			}

			case "gallon": {

				total = qty * ounce / gallon;
				break;
			}

			default: {
				System.out.println("Second unit not selected");
				break;
			}
			}//end sub
			break;

		}//end oz main

		case "cup": {
			switch (unit2.trim()) {

			case "oz": {
				total = qty / cup;
				break;

			}

			case "cup": {
				total = qty;
				break;
			}

			case "pint": {
				total = qty* cup / pint;
				break;
			}

			case "quart": {
				total = qty * cup / quart;
				break;
			}

			case "gallon": {
				total = qty * cup / gallon;
				break;
			}

			default: {
				System.out.println("Second unit not selected");
				break;
			}
			}//end sub
			break;
		}//end cup main
		
		case "pint":{
			switch (unit2.trim()) {

			case "oz": {
				total = qty *pint/ ounce;
				break;

			}

			case "cup": {

				total = qty * pint / cup ;
				break;
			}

			case "pint": {

				total = qty;
				break;
			}

			case "quart": {
				total = qty * pint / quart;
				break;
			}

			case "gallon": {
				total = qty * pint / gallon;
				break;
			}

			default: {
				System.out.println("Second unit not selected");
				break;
			}
			}//end sub
			break;
		
		}//end pint main
		case "quart": {
			switch (unit2.trim()) {

			case "oz": {
				total = qty * quart/ ounce;
				break;
			}

			case "cup": {
				total = qty * quart / cup;
				break;
			}

			case "pint": {
				total = qty * quart / pint;
				break;
			}

			case "quart": {
				total = qty;
				break;
			}

			case "gallon": {
				total = qty * quart / gallon;
				break;
			}

			default: {
				System.out.println("Second unit not selected");
				break;
			}
			}//end sub
			break;
		}//end quart main

		case "gallon": {
			switch (unit2.trim()) {

			case "oz": {
				total = qty * gallon/ ounce;
				break;
			}

			case "cup": {
				total = qty * gallon /  cup;
				break;
			}

			case "pint": {
				total = qty *gallon / pint;
				break;
			}

			case "quart": {
				total = qty * gallon/ quart;
				break;
			}

			case "gallon": {
				total = qty;
				break;
			}

			default: {
				System.out.println("Second unit not selected");
				break;
			}
			}//end sub case
		
		}//end gallon main

		default: {
			System.out.println("Not a Selection");
			break;
		}
		}//end main switch statement

		System.out.println(total + " "+ unit2.trim() );
	}//end conversion method

	public static void main(String[] args) {
		// Create object of the converter class for menu and selection

		Converter conv = new Converter();

		// show menu
		conv.menu();

		// Create a scanner object to accept user input
		Scanner scanIn = new Scanner(System.in);

		// unit one selection

		String unit1 = conv.menuSelection(scanIn);

		// second menu for second user
		conv.menu();

		System.out.println("Enter Second Unit : ");

		// unit 2 selection

		String unit2 = conv.menuSelection(scanIn);
		
		//Message
		System.out.println("Please Enter Quantity : \n");
		
		//create  quantity variable for conversion method
		
		double qty = Double.parseDouble(scanIn.next().trim());
		
		//Message
		System.out.println(unit1 + " => " +  unit2);
		
		//Conversion Method
		conv.conversion(qty, unit1, unit2);
		
		//Closing scanner 
		scanIn.close();
/*
		// used to clear the screen in cmd line
		System.out.print("\033[H\033[2J");
		System.out.flush();
*/
	}

}
