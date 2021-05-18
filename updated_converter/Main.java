package updated_converter;

public class Main {

	public static void main(String[] args) {

		while (!false) {
			// Starts converters
			ConverterFactory cf = new ConverterFactory();

			// select converter
			cf.menuSelection();

			// save quantity
			cf.setQty();

			// Show converter menu
			cf.menu();

			// Accept user input
			cf.setInput1();

			// Show menu again
			cf.menu();

			// Accept user input
			cf.setInput2();

			// perform conversion
			cf.conversion();

			System.out.flush();

		}
	}
}
