package basicconcept;//WAP on Exception handling
import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class Assignment_61_Try_Catch_Block
{	
public static void main(String[] args) 
{

try 
{
Scanner n = new Scanner(System.in);
System.out.println("Please enter the PAN number");
int PAN = n.nextInt();

}
catch (InputMismatchException a1)
{
	try 
	{
		Scanner n = new Scanner(System.in);
	
		System.out.println("Please enter the numeric PAN number");
		int PAN = n.nextInt();
		n.close();		
	}
	catch(RuntimeException a2)
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Please enter the PAN number Correctly");
		int PAN = n.nextInt();
		//System.out.println("Exception Handeled");
		
	}
	System.out.println("Thanks for handling");
	

}

}
	
}
		


