import java.util.ArrayList;
import java.util.Scanner;

import phonenumber.CompanyNumber;
import phonenumber.FriendNumber;
import phonenumber.Phoneinput;
import phonenumber.Phonenumber;
import phonenumber.PhonenumberKind;
import phonenumber.SocialNumber;

public class PhonenumberManager {	
	ArrayList<Phoneinput> phonenumbers = new ArrayList<Phoneinput>();  //Ŭ������ �ٷ�� �� 
	Scanner input;
	PhonenumberManager(Scanner input){  //Ŭ���� ������ �θ� ��� �޼ҵ忡�� ��ǲ�� ��� �����ϴ�.
		this.input = input;
	}
	
	public void addPhonenumber() {
		int kind = 0;
		Phoneinput phoneinput;
		while (kind != 1 && kind != 2) {
			System.out.println("1. Friend");
			System.out.println("2. Social");
			System.out.println("3. Company");
			System.out.print("Select Group:");
			kind = input.nextInt();
			if (kind == 1) {
				phoneinput = new FriendNumber(PhonenumberKind.Friend);
				phoneinput.getUserInput(input);
				phonenumbers.add(phoneinput);
				break;
			}
			else if (kind == 2) {
				phoneinput = new SocialNumber(PhonenumberKind.Social);
				phoneinput.getUserInput(input);
				phonenumbers.add(phoneinput);
				break;
			}
			
			else if (kind == 3) {
				phoneinput = new CompanyNumber(PhonenumberKind.Company);
				phoneinput.getUserInput(input);
				phonenumbers.add(phoneinput);
				break;
			}
			else {
				System.out.print("Select Group:");
			}			
		}
	}
	
	public void deletePhonenumber() {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		int index = -1; //�ε��� ��̿��� ��ã�Ҵٴ� �ǹ��̴�.
		for (int i = 0; i < phonenumbers.size(); i++) {  //ã��������  i�� ������Ų��.
			if (phonenumbers.get(i).getNumber() == number) {  //�Է¹��� ���� ������ ��, get �ε����� ���Ͽ� �ʵ� ������ �����ϴ�.
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			phonenumbers.remove(index);
			System.out.println("��ȣ" + number + "�� �����Ͼ����ϴ�.");
		}
		else {
			System.out.println("������� ���� ��ȣ�Դϴ�.");
			return;
		}
	}
	
	public void editPhonenumber() {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		for (int i = 0; i < phonenumbers.size(); i++) {
			Phoneinput phoneinput = phonenumbers.get(i);
			if (phoneinput.getNumber() == number) {
				int num = -1;				
				while (num  !=3) {
					System.out.println("*** Phone Number Info Edit Menu  ***");
					System.out.println("1. Edit Number");
					System.out.println("2. Edit Name");
					System.out.println("3. Exit");
					System.out.println("Select one number between 1 - 3:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Number");
						int number1 = input.nextInt();
						phoneinput.setNumber(number1);
					}
					else if (num == 2) {
						System.out.print("Name");
						String name = input.next();
						phoneinput.setName(name);
					}
					else {
						continue;
					}
				}  //if
			} //while
		} //if
	} //for
	
	public  void veiwPhonenumber() {
//		System.out.println("Phonenumber:");
//		int number = input.nextInt();
		for (int i = 0; i < phonenumbers.size(); i++) {
			phonenumbers.get(i).printInfo();
		}
	}
}
