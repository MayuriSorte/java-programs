package basicconcept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_64_Finally_Keyword {

	public static void main(String[] args) {
       
		try 
		{
			Scanner n = new Scanner(System.in);
			System.out.println("Please enter the PAN number");
			int PAN[] = new int [ n.nextInt()];
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Enter the appropriate input");
			
		}
		finally
		{
			System.out.println("just checking, what is happening here");
		}

	}

}
