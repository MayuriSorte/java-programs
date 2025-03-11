package basicconcept;//WAP to accept the values of your array at run time
import java.util.Arrays;
import java.util.Scanner;
public class Assignment_76_Array_RuntimeInput {
    
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		int EmployeeIdNumber []=new int[4];
		 
	for (int i=0;i<=3;i++) 
	{
    System.out.println("Please enter the value of array");
    int a = s.nextInt(); 
    EmployeeIdNumber[i]=a;
    }
	System.out.println(Arrays.toString(EmployeeIdNumber));
	s.close();
	
	}
	
}
