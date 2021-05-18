package updated_converter;

import java.util.Scanner;

public class ConverterFactory {
	private Scanner scanner;
	private Converter converter;
	private final String menu = "1. Liquid Converter \n" + "2. Distance Converter \n" + "3. Quit";
	
	//constructor
	public ConverterFactory() {

		System.out.println(menu);

		scanner = new Scanner(System.in);
		// menuSelection();
	}

	//method to select input for menu items
	public void menuSelection() {

		switch (scanner.next()) {// switch statement based on input
		
		case "1": {
			
			//creates Liquid Converter
			converter = new LiquidConverter();

			System.out.println("Enter Liquid Amount");
			break;
		}

		case "2": {

			//creates Distance converter
			converter = new DistanceConverter();
			System.out.println("Enter Distance Amount : ");
			break;
		}

		case "3": {
			//exit program
			System.out.println("Exiting");
			System.exit(0);
		}

		default: {
			System.out.println("\n Proper Input Needed between 1-3 \n");

			//prints menu items
			System.out.println(menu);
			
			//calls to reselect menu items
			menuSelection();

			break;
		}

		}// end switch

	}

	//method used to select user's first input
	public void setInput1() {

		//accepts scanner input
		String measurement = converter.menuSelection(scanner);

		//checks if measurement is not blank string
		if (!measurement.isBlank()) {
			//sets input
			converter.setInput1(measurement);

			//measurement is blank
		} else if (measurement.isBlank()) {

			//calls method again
			setInput1();
		}
	}
	
	//method used to select user's second input
	public void setInput2() {
		//accepts scanner input
		String measurement = converter.menuSelection(scanner);

		//checks if measurement is not blank string
		if (!measurement.isBlank()) {
			//sets input
			converter.setInput2(measurement);

			//measurement is blank
		} else if (measurement.isBlank()) {

			System.out.println("No Input");
			
			//calls method again
			setInput2();
		}
	}
	
	//checks if quantity from scanner is a double
	public boolean qtyCheck() {
		if(scanner.hasNextDouble()) {
		return true;
		}
		System.out.println("Needs to be a Number. Please Try Again.");
		scanner.nextLine();
		return false;
	}

	//sets quantity if qtyCheck() is true
	public void  setQty() {
		
		if(qtyCheck() == false) {
			scanner.nextLine();
			qtyCheck();
		}

		String quantity = scanner.next();
		
		//sets quantity as double in converter class
	converter.setQty(Double.parseDouble(quantity));
	}

	//gets menu and prints
	public void menu() {
		converter.menu();
	}

	//selects item of menu selection
	public String menuSelector() {

		return converter.menuSelection(scanner);

	}

	//makes conversion
	public void conversion() {
		converter.conversion();
	}

}
