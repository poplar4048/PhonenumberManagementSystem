package phonenumber;

import java.util.Scanner;

public class Phonenumber {
	
	protected PhonenumberKind kind = PhonenumberKind.Friend;
	public PhonenumberKind getKind() {
		return kind;
	}

	public void setKind(PhonenumberKind kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected int number;
	protected String name;
	
	public Phonenumber() {
		
	}
	
	public Phonenumber(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public void printInfo() { 
		System.out.println("number:" + number + "name:" + name);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Name:");	
		String name = input.next(); 
		this.setName(name);
	}
}
