package updated_converter;

import java.util.Scanner;

/*
 * Created an interface that will be implemented by all converter classes
 * 
 * All methods are self explanatory the only method that may be redone is the setQty() due to the parameter double to String for scanner.
 */

public interface Converter {

public void menu();

public String menuSelection(Scanner scanner);

public void conversion();

public void setQty(double qty);// may need to change

public double getQty();

public void setInput1(String string);

public String getInput1();

public void setInput2(String string);

public String getInput2();
}
