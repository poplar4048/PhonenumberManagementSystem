import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
				
		while (num  !=6) {
			System.out.println("1. Add Number");
			System.out.println("2. Delete Number");
			System.out.println("3. Edit Number");
			System.out.println("4. View Number");
			System.out.println("5. Show Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			//if (num==1) {
				//System.out.print("Phonenumber:");
				//int Phonenumber = input.nextInt();
				//System.out.print("Name:");
				//String Name = input.next();
				//System.out.print("Phonenumber:");
			switch(num) {
			case 1:
				System.out.print("Phone number:");
				int Phonenumber = input.nextInt();
				System.out.print("Name:");
				String Name = input.next();
				System.out.println("Done!");
				break;
			case 2:
				System.out.print("Delete Number:");
				String DeleteNumber = input.next();
				System.out.println("Done!");
				break;
			case 3:
				System.out.print("Before Edit Number:");
				String BeforeEditNumber = input.next();
				System.out.print("After Edit Number:");
				String AfterEditNumber = input.next();
				System.out.println("Done!");
				break;
			case 4:
				System.out.println("View Number");
				//추후에 전화번호 데이터가 등록되면 보여질곳
				System.out.println("Done!");
				break;
			case 5:
				continue;
			case 6:
				break;
			
			}
			
		}

	}
}	
