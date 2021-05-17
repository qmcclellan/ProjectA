package updated_converter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DistanceConverter implements Converter {
	
	private final double inch = 1;
	private final double foot = 12;
	private final double yard = 36;
	private final double mile = 63360;
	
	private double qty;
	private String input1;
	private String input2;
	
	public DistanceConverter(){
		System.out.println("Please Enter Amount of Units Then Press Enter");
	}
	
	

	
	public synchronized String getInput1() {
		return input1;
	}




	public synchronized void setInput1(String string) {
		this.input1 = string;
	}




	public synchronized String getInput2() {
		return input2;
	}




	public synchronized void setInput2(String string) {
		this.input2 = string;
	}




	public void setQty(Scanner scanner) {
		try {
		this.qty = scanner.nextDouble();
		}catch(InputMismatchException ime) {
			System.out.println("Please enter Numeric Value : ");
			this.qty = scanner.nextDouble();
			
			}
		
	}
	
	
	public double getQty() {
		return qty;
	}
	
	// menu method used to print the menu to the screen

public void menu() {
String menu = "1. Inch \n" + "2. Foot \n" + "3. Yard \n" + "4. Mile \n"+"5. quit \n";

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
		if(measurement.matches("[0-5]+")) {
		switch (measurement) { //Test the input for measurement selection

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

		}

		default: {
			return "Selection Not Found!";
		}

		}//end switch
		
		}//end if
		System.out.println("Select Betwenn 1-5");
	}//end while
	return "Selection Not Found!";
}

// used to do the conversion of one unit to another

public void conversion() {

	double qty = getQty();
	String unit1 =getInput1();
	
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

		case "mile": {

			total = qty * inch / mile;
			break;
		}

		default: {
			System.out.println("Second unit not selected");
			break;
		}
		}//end sub
		break;

	}//end inch main

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
			total = qty* foot / yard;
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
		}//end sub
		break;
	}//end foot main
	
	case "yard":{
		switch (unit2.trim()) {

		case "inch": {
			total = qty *yard/ inch;
			break;

		}

		case "foot": {

			total = qty * yard / foot ;
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
		}//end sub
		break;
	
	}//end yard main
	case "mile": {
		switch (unit2.trim()) {

		case "inch": {
			total = qty * mile/ inch;
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
		}//end sub
		break;
	}//end mile main

	default: {
		System.out.println("Not a Selection");
		break;
	}
	}//end main switch statement

	System.out.println(total + " "+ unit2.trim() );
	
	
}//end conversion method










}
