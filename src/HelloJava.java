import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String name = scan.nextLine();
		System.out.println("Hello, " + name);
		
		
		scan.close();
	}

}
