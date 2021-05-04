import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		PhonenumberManager phonenumberManager = new PhonenumberManager(input);		
		int num = -1;
						
		while (num  !=5) {
			System.out.println("*** Phone Number Management System Menu  ***");
			System.out.println("1. Add Number");
			System.out.println("2. Delete Number");
			System.out.println("3. Edit Number");
			System.out.println("4. View Numbers");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5:");
			num = input.nextInt();
			if (num == 1) {
				phonenumberManager.addPhonenumber();
			}
			else if (num == 2) {
				phonenumberManager.deletePhonenumber();
			}
			else if (num == 3) {
				phonenumberManager.editPhonenumber();
			}
			else if (num == 4) {
				phonenumberManager.veiwPhonenumber();
			}
			else {
				continue;
			}
		}	
	}
}	
