import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {	 
		
		Scanner input = new Scanner(System.in);	
		PhonenumberManager phonenumberManager = getObject("phonenumbermanager.ser");
		if (phonenumberManager == null) {
			phonenumberManager = new PhonenumberManager(input);
		}
		
		selectMenu(input, phonenumberManager);
		putObject(phonenumberManager, "phonenumbermanager.ser");
	}
	
	public static void selectMenu(Scanner input, PhonenumberManager phonenumberManager) {
		int num = -1;
		while (num  !=5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					phonenumberManager.addPhonenumber();
					logger.log("add phonenumber");
					break;
				case 2:
					phonenumberManager.deletePhonenumber();
					logger.log("delete phonenumber");
					break;
				case 3:
					phonenumberManager.editPhonenumber();
					logger.log("edit phonenumber");
					break;
				case 4:
					phonenumberManager.veiwPhonenumber();
					logger.log("view phonenumber");
					break;
				default:
					continue;
				}
			}
			
			catch(InputMismatchException e) {
				System.out.println("Only put a integer between 1 ~ 5");
				
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Phone Number Management System Menu  ***");
		System.out.println("1. Add Number");
		System.out.println("2. Delete Number");
		System.out.println("3. Edit Number");
		System.out.println("4. View Numbers");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
	}
	
	public static PhonenumberManager getObject(String filename) {
		PhonenumberManager phonenumberManager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			phonenumberManager = (PhonenumberManager) in.readObject();
			
			in.close();
			file.close();
			
			
		}
		catch (FileNotFoundException e){
			return phonenumberManager;
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return phonenumberManager;
	}
	
	public static void putObject(PhonenumberManager phonenumberManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(phonenumberManager);
			
			out.close();
			file.close();
			
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
	}
}	
