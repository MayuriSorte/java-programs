package basicconcept;//WAP on Exception handling using nested try catch keywords

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_62_Try_Catch_Nested_Block {
	public static void main(String[] args) {
		try {
			Scanner n = new Scanner(System.in);
			System.out.println("Please enter the PAN number");
			int PAN = n.nextInt();
		    } 
		catch (InputMismatchException a1) 
		{
			try {
				Scanner n = new Scanner(System.in);
				System.out.println("Please enter the PAN number and it must be numeric");
				int PAN = n.nextInt();
				n.close();
			} 
			catch (InputMismatchException a2) {
				Scanner n = new Scanner(System.in);
				System.out.println("Please enter the numric value for PAN number");
				int PAN = n.nextInt();
				System.out.println("Thanks for handling");
			}

		}
	}
}
