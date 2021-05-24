package phonenumber;

import java.util.Scanner;

public class FriendNumber extends Phonenumber {
	
	public FriendNumber(PhonenumberKind kind) {
		super(kind);	
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Name:");	
		String name = input.next(); 
		this.setName(name);
		
		System.out.print("Address:");	
		String address = input.next(); 
		this.setAddress(address);
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

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		
	}
}
