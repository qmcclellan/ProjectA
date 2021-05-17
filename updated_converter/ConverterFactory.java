package updated_converter;

import java.util.Scanner;

public class ConverterFactory {
	private Scanner scanner;
	private Converter converter;
	
	
	public ConverterFactory() {
		scanner = new Scanner(System.in);
		System.out.println("1. Liquid Converter \n"+
							"2. Distance Converter \n"+
							"3. Quit");
		
	}
	
	public void menuSelection() {

		
		//while(!scanner.next().isEmpty()) {
		
			//if(scanner.next().matches("[1-3]+")) {
				
		switch(scanner.next()) {
		case "1":{
			converter = new LiquidConverter();
			
			System.out.println("Liquid");
			break;
		}
		
		case "2" :{
			
			converter = new DistanceConverter();
			System.out.println("Distance");
			break;
		}
		
		case "3" :{
			System.out.println("Exiting");
			System.exit(0);
		}
		
		default:{
			System.out.println("Input Needed");
			new ConverterFactory();
			break;
		}
		}// end switch
		//	}//end if
		//}// end while
	
	}
	
	public void setInput1() {
		converter.setInput1(converter.menuSelection(scanner));
	}
	
	public void setInput2() {
		converter.setInput2(converter.menuSelection(scanner));
	}
	

	public void setQty() {
		converter.setQty(scanner);
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
