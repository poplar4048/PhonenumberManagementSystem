package phonenumber;

import java.util.Scanner;

public class CompanyNumber extends Phonenumber {
	
	protected String companyAddress;
	
	public CompanyNumber(PhonenumberKind kind) {
		super(kind);	
	}
		
	public void getUserInput(Scanner input) {
		setNumber(input);
		setName(input);
		
		char answer = 'x';
		
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you register address? (Y/N)");
				answer = input.next().charAt(0);	
				if (answer == 'y' || answer == 'Y') {
					setAddress(input);
					break;
				}
			
				else if (answer == 'n' || answer == 'N') {
					this.setAddress("");
					break;
				}
			
				else {
				
				}
			}
		
		answer = 'x';
		
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
		System.out.print("Do you register company address? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
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
		String skind = getKindString();
		System.out.println("kind:"+ skind + "number:" + number + "name:" + name + "address:" + address + "company address:" + address);
	}
	
	public String getKindString() {
		
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
		return skind;
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		
	}
}
