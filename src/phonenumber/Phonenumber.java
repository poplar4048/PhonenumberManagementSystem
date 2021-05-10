package phonenumber;

import java.util.Scanner;

public abstract class Phonenumber { //객체를 생성하지 않는다.
	
	protected PhonenumberKind kind = PhonenumberKind.Friend;
	protected int number;
	protected String name;
	protected String address;
	
	public Phonenumber() {
		
	}
	
	public Phonenumber(PhonenumberKind kind) {
		this.kind = kind;	
	}
	
	public Phonenumber(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Phonenumber(PhonenumberKind kind, int number, String name, String address) {
		this.kind = kind;
		this.number = number;
		this.name = name;
		this.address = address;
	}
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
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public abstract void printInfo();
	
//	public void getUserInput(Scanner input) {
//		System.out.print("Phonenumber:");
//		int number = input.nextInt();
//		this.setNumber(number);
//		
//		System.out.print("Name:");	
//		String name = input.next(); 
//		this.setName(name);
//		
//		System.out.print("Address:");	
//		String address = input.next(); 
//		this.setAddress(address);
//	}
}
