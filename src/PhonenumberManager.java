import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import phonenumber.CompanyNumber;
import phonenumber.FriendNumber;
import phonenumber.Phoneinput;
import phonenumber.PhonenumberKind;
import phonenumber.SocialNumber;

public class PhonenumberManager implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6922912264643538195L;
	ArrayList<Phoneinput> phonenumbers = new ArrayList<Phoneinput>();  //Ŭ������ �ٷ�� �� 
	transient Scanner input;
	PhonenumberManager(Scanner input){  //Ŭ���� ������ �θ� ��� �޼ҵ忡�� ��ǲ�� ��� �����ϴ�.
		this.input = input;
	}
	
	public void addPhonenumber() {
		int kind = 0; 
		Phoneinput phoneinput;
		while (kind != 1 && kind != 2) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("Only put an integer between 1 ~ 3");
				
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void deletePhonenumber() {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		int index = findIndex(number);
		removefromPhonenumbers(index, number);
	}
	
	public int findIndex(int number) {
		int index = -1; //�ε��� ��̿��� ��ã�Ҵٴ� �ǹ��̴�.
		for (int i = 0; i < phonenumbers.size(); i++) {  //ã��������  i�� ������Ų��.
			if (phonenumbers.get(i).getNumber() == number) {  //�Է¹��� ���� ������ ��, get �ε����� ���Ͽ� �ʵ� ������ �����ϴ�.
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromPhonenumbers(int index, int number) {
		if (index >= 0) {
			phonenumbers.remove(index);
			System.out.println("��ȣ" + number + "�� �����Ͼ����ϴ�.");
			return 1;
		}
		else {
			System.out.println("������� ���� ��ȣ�Դϴ�.");
			return -1;
		}
	}
	
	public void editPhonenumber() {
		System.out.print("Phonenumber:");
		int phonenumber = input.nextInt();
		for (int i = 0; i < phonenumbers.size(); i++) {
			Phoneinput number = phonenumbers.get(i);
			if (number.getNumber() == phonenumber) {
				int num = -1;				
				while (num  !=3) {
					showEidtMune();
					num = input.nextInt();
					switch(num) {
					case 1:
						number.setNumber(input);
						break;
					case 2:
						number.setName(input);
						break;
					default:
						continue;
					}
				}  //while
				break;
			}  //if
		}//for
	} 
	
	public  void veiwPhonenumber() {
		System.out.print("# of registered number: " + phonenumbers.size());
		for (int i = 0; i < phonenumbers.size(); i++) {
			phonenumbers.get(i).printInfo();
		}
	}
	
	public void showEidtMune() {
		System.out.println("*** Phone Number Info Edit Menu  ***");
		System.out.println("1. Edit Number");
		System.out.println("2. Edit Name");
		System.out.println("3. Exit");
		System.out.println("Select one number between 1 - 3:");
		
	}
}
