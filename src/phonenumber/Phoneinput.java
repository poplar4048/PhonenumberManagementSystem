package phonenumber;

import java.util.Scanner;

public interface Phoneinput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
}
