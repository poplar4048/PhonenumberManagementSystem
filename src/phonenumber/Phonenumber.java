package phonenumber;

import java.util.Scanner;

public abstract class Phonenumber { //��ü�� �������� �ʴ´�.
	
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

}
