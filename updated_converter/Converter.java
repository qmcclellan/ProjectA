package updated_converter;

import java.util.Scanner;

public interface Converter {

public void menu();

public String menuSelection(Scanner scanner);

public void conversion();

public void setQty(Scanner scanner);

public double getQty();

public void setInput1(String string);

public String getInput1();

public void setInput2(String string);

public String getInput2();
}
