package phonenumber;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Phonenumber implements Phoneinput, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3800549109565680600L;
	protected PhonenumberKind kind = PhonenumberKind.Friend;
	protected int number;
	protected String name;
	protected String address;
	
	public Phonenumber() {
		
	}
	
	public Phonenumber(PhonenumberKind kind) {
		this.kind = kind;	
	}
	
	public Phonenumber(int number, String name, String address) {
		this.number = number;
		this.name = name;
		this.address = address;
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
	
	public void setNumber(Scanner input) {
		System.out.print("Number");
		int number = input.nextInt();
		this.setNumber(number);	
	}
	
	public void setName(Scanner input) {
		System.out.print("Name");
		String name = input.next();
		this.setName(name);
	}
	
	public void setAddress(Scanner input) {
		System.out.print("Address");
		String address = input.next();
		this.setAddress(address);
	}
	
}
