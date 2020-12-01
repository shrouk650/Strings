import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		
		//Take 2 names from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String First_name = sc.next();
		System.out.println("Enter Second name");
		String Second_name = sc.next();
		
		//Compare between two inputs
		boolean result = First_name.equals(Second_name);
		boolean result1 = First_name.equalsIgnoreCase(Second_name);
		
		System.out.println(result);
		System.out.println(result1);
	}
	
}
