package	phonenumber;

import java.util.Scanner;

public class SocialNumber extends Phonenumber implements Phoneinput {
	
	public SocialNumber(PhonenumberKind kind) {
		super(kind);	
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		this.setNumber(number);
	
		System.out.print("Name:");	
		String name = input.next(); 
		this.setName(name);
		
		char answer = 'x';
		
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
		System.out.print("Do you register address? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Address:");
				String address = input.next();
				this.setAddress(address);
				break;
			}
		
			else if (answer == 'n' || answer == 'N') {
				this.setAddress("");
				break;
			}
		
			else {
			
			}
		}
	}	
		public void printInfo() { 
			
			String skind = "none";
			
			switch(this.kind) {	
			case Friend:
				skind = "Friend";
				break;
			case Social:
				skind = "Social";
				break;
			case Company:
				skind = "Company";
				break;
			case University:
				skind = "University";
				break;
			default:
				
			}
			System.out.println("kind:"+ skind + "number:" + number + "name:" + name + "address:" + address + "company address:" + address);				
	}

}