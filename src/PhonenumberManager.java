import java.util.Scanner;

public class PhonenumberManager {
	
	Phonenumber phonenumber; 
	Scanner input;
	PhonenumberManager(Scanner input){  //클레스 레벨에 두면 모든 메소드에서 인풋을 사용 가능하다.
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
			System.out.println("등록하지 않은 번호입니다.");
			return;
		}
		if (phonenumber.number == number) {
			phonenumber =null;
			System.out.println("번호를 삭제하셨습니다.");
		}
	}
	public void editPhonenumber() {
		System.out.print("Phonenumber:");
		int number = input.nextInt();
		if (phonenumber.number == number) {
			phonenumber =null;
			System.out.println("번호를 수정하셨습니다." + number);
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
