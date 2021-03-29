import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int num = 5;
		
				
		while (num  !=6) {
			System.out.println("*** Phone Number Management System Menu  ***");
			System.out.println("1. Add Number");
			System.out.println("2. Delete Number");
			System.out.println("3. Edit Number");
			System.out.println("4. View Number");
			System.out.println("5. Show Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			if (num == 1) {
				addPhonenumber();
			}
			else if (num == 2) {
				deletePhonenumber();
			}
			else if (num == 3) {
				editPhonenumber();
			}
			else if (num == 4) {
				veiwPhonenumber();
			}
			else {
				continue;
			}

		}	
	}
	
	public static void addPhonenumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Phonenumber:");
		int Phonenumber = input.nextInt();
		System.out.print("Name:");
		String Name = input.next();
	}
	
	public static void deletePhonenumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Phonenumber:");
		int Phonenumber = input.nextInt();
	}
	public static void editPhonenumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("BeforePhonenumber:");
		int BeforePhonenumber = input.nextInt();
		System.out.print("AfterPhonenumber:");
		int AfterPhonenumber = input.nextInt();
		System.out.print("Name:");
		String Name = input.next();
	}
	public static void veiwPhonenumber() {
		System.out.println("View Number");
		System.out.println("Done!");
	}
}	
