package phonenumber;

import java.util.Scanner;

public class SocialNumber extends Phonenumber {
	
	public void getUserInput(Scanner input) {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		this.setNumber(number);
	
		System.out.print("Name:");	
		String name = input.next(); 
		this.setName(name);
	}
}