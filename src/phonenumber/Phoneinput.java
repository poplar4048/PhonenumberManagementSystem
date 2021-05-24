package phonenumber;

import java.util.Scanner;

public interface Phoneinput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setAddress(String address);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setNumber(Scanner input);
	
	public void setName(Scanner input);
	
	public void setAddress(Scanner input);
	
}
