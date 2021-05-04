import java.util.ArrayList;
import java.util.Scanner;

import phonenumber.CompanyNumber;
import phonenumber.Phonenumber;
import phonenumber.PhonenumberKind;
import phonenumber.SocialNumber;

public class PhonenumberManager {	
	ArrayList<Phonenumber> phonenumbers = new ArrayList<Phonenumber>();  //클래스를 다루는 것 
	Scanner input;
	PhonenumberManager(Scanner input){  //클래스 레벨에 두면 모든 메소드에서 인풋을 사용 가능하다.
		this.input = input;
	}
	
	public void addPhonenumber() {
		int kind = 0;
		Phonenumber phonenumber;
		while (kind != 1 && kind != 2) {
			System.out.println("1. Friend");
			System.out.println("2. Social");
			System.out.println("3. Company");
			System.out.print("Select Group:");
			kind = input.nextInt();
			if (kind == 1) {
				phonenumber = new Phonenumber(PhonenumberKind.Friend);
				phonenumber.getUserInput(input);
				phonenumbers.add(phonenumber);
				break;
			}
			else if (kind == 2) {
				phonenumber = new SocialNumber(PhonenumberKind.Social);
				phonenumber.getUserInput(input);
				phonenumbers.add(phonenumber);
				break;
			}
			
			else if (kind == 3) {
				phonenumber = new CompanyNumber(PhonenumberKind.Company);
				phonenumber.getUserInput(input);
				phonenumbers.add(phonenumber);
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
		int index = -1; //인덱스 어레이에서 못찾았다는 의미이다.
		for (int i = 0; i < phonenumbers.size(); i++) {  //찾을때까지  i를 증가시킨다.
			if (phonenumbers.get(i).getNumber() == number) {  //입력받은 값이 같은지 비교, get 인덱스를 통하여 필드 접근이 가능하다.
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			phonenumbers.remove(index);
			System.out.println("번호" + number + "를 삭제하었습니다.");
		}
		else {
			System.out.println("등록하지 않은 번호입니다.");
			return;
		}
	}
	
	public void editPhonenumber() {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		for (int i = 0; i < phonenumbers.size(); i++) {
			Phonenumber phonemunber = phonenumbers.get(i);
			if (phonemunber.getNumber() == number) {
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
						phonemunber.setNumber(number1);
					}
					else if (num == 2) {
						System.out.print("Name");
						String name = input.next();
						phonemunber.setName(name);
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
