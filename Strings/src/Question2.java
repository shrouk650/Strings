import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
			
			//Take 2 names from user
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first name");
			String First_name = sc.nextLine();
			System.out.println("Enter Second name");
			String Second_name = sc.next();
			
			//If First name contain second name
			
			boolean result = First_name.contains(Second_name);		
			System.out.println(result);	
		}
	}

