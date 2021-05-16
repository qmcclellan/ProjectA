package updated_converter;

import java.util.Scanner;

public class ConverterFactory {
	private Scanner scanner = new Scanner(System.in);
	private Converter converter;
	
	
	public ConverterFactory() {
		
		System.out.println("1. Liquid Converter \n"+
							"2. Distance Converter \n");
		
		
		while(!scanner.next().isEmpty()) {
		
			if(scanner.next().matches("[1-2]+")) {
				
		switch(scanner.next()) {
		case "1":{
			converter = new LiquidConverter();
		}
		
		case "2" :{
			
			converter = new DistanceConverter();
		}
		
		case "3" :{
			System.exit(0);
		}
		
		default:{
			System.out.println("Input Needed");
			new ConverterFactory();
		}
		}// end switch
			}//end if
		}// end while
		converter.menu();
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
	
		public String menuSelection() {
		
		return converter.menuSelection(scanner);
		
	}
	
		public void conversion() {
			converter.conversion();
		}
	

}
