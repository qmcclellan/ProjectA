package updated_converter;

import java.util.Scanner;
/*
 * Class creates a converter for liquid standard measurements
 * 
 * menu() - prints a menu
 * 
 * menuSelection() takes in scanner and selects string based on user input
 * 
 * 
 */

public class LiquidConverter implements Converter {
	// Variables of the class and factors for the conversion

	private final double ounce = 1;
	private final double cup = 8;
	private final double pint = 16;
	private final double quart = 32;
	private final double gallon = 128;

	/*
	 * Variables that will be set in class by user input
	 */
	private double qty;
	private String input1;
	private String input2;

	// constructor
	public LiquidConverter() {

		System.out.println("Please Enter Amount of Units Then Press Enter");
	}

	// menu method used to print the menu to the screen
	public void menu() {
		String menu = "1. Oz \n" + "2. cup \n" + "3. pint \n" + "4. quart \n" + "5. gallon \n" + "6. quit \n";

		System.out.println(menu);

	}

	// accept scanner input and saves in if not blank
	public void setInput1(String string) {
		String input = string;

		if (!input.isBlank()) {
			this.input1 = input;
		}

	}

//input1 getter
	public String getInput1() {
		return input1;
	}

	// accept scanner input and saves in if not blank
	public void setInput2(String string) {

		String input = string;

		if (!input.isBlank()) {
			this.input2 = input;
		}

	}

//input2 getter
	public String getInput2() {
		return input2;
	}

	// setter for qty variable
	public void setQty(double qty) {
		this.qty = qty;

	}

	// getter for qty variable
	public double getQty() {
		return qty;
	}

	/*
	 * Get Selection from user input to scanner Sets input into String uses while
	 * statement to check if scanner is empty if it isn't empty switches to the case
	 * provided
	 */

	public String menuSelection(Scanner scanner) {

		String measurement = scanner.next();

		// Used to test if user has made input
		while (!measurement.isEmpty()) {

			// if user input is a numeric value, if not default
			if (measurement.matches("[1-6]+")) {
				switch (measurement) { // Test the input for measurement selection

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

				}// end switch
			} // end if
		} // end while

		return null;
	}

	// used to do the conversion of one unit to another

	public void conversion() {
		double qty = getQty();
		String unit1 = getInput1();

		String unit2 = getInput2();

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
			}// end sub
			break;

		} // end oz main

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
				total = qty * cup / pint;
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
			}// end sub
			break;
		} // end cup main

		case "pint": {
			switch (unit2.trim()) {

			case "oz": {
				total = qty * pint / ounce;
				break;

			}

			case "cup": {

				total = qty * pint / cup;
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
			}// end sub
			break;

		} // end pint main
		case "quart": {
			switch (unit2.trim()) {

			case "oz": {
				total = qty * quart / ounce;
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
			}// end sub
			break;
		} // end quart main

		case "gallon": {
			switch (unit2.trim()) {

			case "oz": {
				total = qty * gallon / ounce;
				break;
			}

			case "cup": {
				total = qty * gallon / cup;
				break;
			}

			case "pint": {
				total = qty * gallon / pint;
				break;
			}

			case "quart": {
				total = qty * gallon / quart;
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
			}// end sub case

		} // end gallon main

		default: {
			System.out.println("Not a Selection");
			break;
		}
		}// end main switch statement

		System.out.println(unit1 + " => " + unit2);

		System.out.println(total + " " + unit2.trim());
	}// end conversion method

}
