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
public class DistanceConverter implements Converter {

	// Variables of the class and factors for the conversion
	private final double inch = 1;
	private final double foot = 12;
	private final double yard = 36;
	private final double mile = 63360;

	/*
	 * Variables that will be set in class by user input
	 */
	private double qty;
	private String input1;
	private String input2;

	// constructor
	public DistanceConverter() {
		System.out.println("Please Enter Amount of Units Then Press Enter");
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

	// menu method used to print the menu to the screen

	public void menu() {
		String menu = "1. Inch \n" + "2. Foot \n" + "3. Yard \n" + "4. Mile \n" + "5. quit \n";

		System.out.println(menu);

	}

	/*
	 * Get Selection from user input to scanner Sets input into String uses while
	 * statement to check if scanner is empty if it isn't empty switches to the case
	 * provided
	 */

	public String menuSelection(Scanner scanner) {

		String measurement = scanner.next();

		switch (measurement) { // Test the input for measurement selection

		case "1": {
			return "inch";

		}

		case "2": {
			return "foot";

		}

		case "3": {
			return "yard";

		}

		case "4": {
			return "mile";

		}

		case "5": {
			System.exit(0);
			break;

		}

		default: {
			System.out.println("Selection Not Found! \n");

			menu();

			return menuSelection(scanner);
			// menuSelection( scanner);

		}

		}// end switch

//	measurement = "Selection Not Found! Please Enter selection!";
		// menuSelection(scanner);
		return measurement;

	}

// used to do the conversion of one unit to another

	public void conversion() {

		// double qty = getQty();
		String unit1 = getInput1();

		String unit2 = getInput2();

		double total = 0;

		switch (unit1.trim()) {// main switch statement

		case "inch": {
			switch (unit2.trim()) {// Nested switch statement

			case "inch": {
				total = qty * inch;
				break;

			}

			case "foot": {

				total = qty * inch / foot;
				unit2 = "feet";
				break;
			}
			case "yard": {
				total = qty * inch / yard;
				break;
			}

			case "mile": {

				total = qty * inch / mile;
				break;
			}

			default: {
				System.out.println("Second unit not selected");
				break;
			}
			}// end sub
			break;

		} // end inch main

		case "foot": {
			switch (unit2.trim()) {

			case "inch": {
				total = qty * foot / inch;
				break;

			}

			case "foot": {
				total = qty;
				unit2 = "feet";
				break;
			}

			case "yard": {
				total = qty * foot / yard;
				break;
			}

			case "mile": {
				total = qty * foot / mile;
				break;
			}

			default: {
				System.out.println("Second unit not selected");
				break;
			}
			}// end sub
			break;
		} // end foot main

		case "yard": {
			switch (unit2.trim()) {

			case "inch": {
				total = qty * yard / inch;
				break;

			}

			case "foot": {

				total = qty * yard / foot;
				unit2 = "feet";
				break;
			}

			case "yard": {

				total = qty;
				break;
			}

			case "mile": {
				total = qty * yard / mile;
				break;
			}

			default: {
				System.out.println("Second unit not selected");
				break;
			}
			}// end sub
			break;

		} // end yard main
		case "mile": {
			switch (unit2.trim()) {

			case "inch": {
				total = qty * mile / inch;
				break;
			}

			case "foot": {
				total = qty * mile / foot;
				unit2 = "feet";
				break;
			}

			case "yard": {
				total = qty * mile / yard;
				break;
			}

			case "mile": {
				total = qty;
				break;
			}

			default: {
				System.out.println("Second unit not selected");
				break;
			}
			}// end sub
			break;
		} // end mile main

		default: {
			System.out.println("Not a Selection");
			break;
		}
		}// end main switch statement

		System.out.println(unit1 + " => " + unit2);

		System.out.println(total + " " + unit2.trim());

	}// end conversion method

}
