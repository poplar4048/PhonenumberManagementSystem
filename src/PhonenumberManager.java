import java.util.Scanner;

public class PhonenumberManager {
	
	Phonenumber phonenumber; 
	Scanner input;
	PhonenumberManager(Scanner input){  //Ŭ���� ������ �θ� ��� �޼ҵ忡�� ��ǲ�� ��� �����ϴ�.
		this.input = input;
	}
	
	public void addPhonenumber() {
		phonenumber = new Phonenumber();
		System.out.print("Phonenumber:");
		phonenumber.number = input.nextInt();
		System.out.print("Name:");
		phonenumber.name = input.next();
	}
	
	public void deletePhonenumber() {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		if (phonenumber == null) {
			System.out.println("������� ���� ��ȣ�Դϴ�.");
			return;
		}
		if (phonenumber.number == number) {
			phonenumber =null;
			System.out.println("��ȣ�� �����ϼ̽��ϴ�.");
		}
	}
	public void editPhonenumber() {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		if (phonenumber.number == number) {
			phonenumber =null;
			System.out.println("��ȣ�� �����ϼ̽��ϴ�." + number);
		}
	}
	public  void veiwPhonenumber() {
		System.out.println("Phonenumber:");
		int number = input.nextInt();
		if (phonenumber.number == number) {
			phonenumber.printInfo();
		}
	}
}
