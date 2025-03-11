package basicconcept;//WAP on Exception Handling using TryCatch 
//When we may get 2 exceptions in a single scenario

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_66_Exception_Handling_Try_Catch {

public static void main(String[] args) throws InputMismatchException
{     
try 
{
		Scanner n = new Scanner(System.in);
		System.out.println("Please enter the PAN number");
		int PAN[] = new int [ n.nextInt()];
}
catch(InputMismatchException a)
{
	Scanner n = new Scanner(System.in);
	System.out.println("Please enter the numric value for PAN number");
	int PAN = n.nextInt();
}
catch(NullPointerException a1)
{
	Scanner n = new Scanner(System.in);
	System.out.println("Please enter the numric value for PAN number");
	int PAN = n.nextInt();
}
finally 
{
	Scanner n = new Scanner(System.in);
	System.out.println("Please enter the Correct numric value for PAN number");
	int PAN = n.nextInt();
	n.close();
}

}
}

