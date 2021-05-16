package updated_converter;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
		
		ConverterFactory cf = new ConverterFactory();
		
		cf.setQty();
		
		cf.menu();
		
		cf.setInput1();
		
		cf.menu();
		
		cf.setInput2( );
		
		cf.conversion();
		
		//scanner.close();
	}
}
