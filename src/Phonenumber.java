
public class Phonenumber {
	
	int number;
	String name;
	
	public Phonenumber() {
		
	}
	
	public Phonenumber(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public void printInfo() {
		System.out.println("number:" + number + "name:" + name);
	}
}
