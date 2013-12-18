
import java.util.Scanner;

public class mouse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		second a = new second();
		
		System.out.println("Enter your name here:");
		String Name = input.nextLine();
		
		a.simpleMessage(Name);
	}

}
