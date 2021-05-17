package updated_converter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConverterFactory {
	private Scanner scanner;
	private Converter converter;
	private final String menu = "1. Liquid Converter \n" + "2. Distance Converter \n" + "3. Quit";

	public ConverterFactory() {

		System.out.println(menu);

		scanner = new Scanner(System.in);
		// menuSelection();
	}

	public void menuSelection() {

		switch (scanner.next()) {
		case "1": {
			converter = new LiquidConverter();

			System.out.println("Liquid Amount");
			break;
		}

		case "2": {

			converter = new DistanceConverter();
			System.out.println("Distance Amount");
			break;
		}

		case "3": {
			System.out.println("Exiting");
			System.exit(0);
		}

		default: {
			System.out.println("\n Proper Input Needed between 1-3 \n");

			System.out.println(menu);

			menuSelection();

			break;
		}

		}// end switch

	}

	public void setInput1() {

		String measurement = converter.menuSelection(scanner);

		if (!measurement.isBlank()) {
			converter.setInput1(measurement);

		} else if (measurement.isBlank()) {

			//System.out.println("rerun");
			setInput1();
		}
	}

	public void setInput2() {
		String measurement = converter.menuSelection(scanner);

		if (!measurement.isBlank()) {
			converter.setInput2(measurement);

		} else if (measurement.isBlank()) {

			System.out.println("No Input");
			setInput2();
		}
	}
	
	public boolean qtyCheck() {
		if(scanner.hasNextDouble()) {
		return true;
		}
		System.out.println("Needs to be a Number.");
		scanner.nextLine();
		return false;
	}

	public void  setQty() {
		
		if(qtyCheck() == false) {
			scanner.nextLine();
			qtyCheck();
		}

		String quantity = scanner.next();
	converter.setQty(Double.parseDouble(quantity));
	}

	public void menu() {
		converter.menu();
	}

	public String menuSelectior() {

		return converter.menuSelection(scanner);

	}

	public void conversion() {
		converter.conversion();
	}

}
