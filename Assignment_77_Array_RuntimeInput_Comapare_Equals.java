package basicconcept;//WAP to check if 2 arrays are equals to each other at run time

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_77_Array_RuntimeInput_Comapare_Equals {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		int EmployeeIdNumber []=new int[4];
		int EmployeeIdNumber_1 []=new int [4];
		 
	for (int i=0;i<=3;i++) 
	{
    System.out.println("Please enter the value of array");
    int a = s.nextInt(); 
    EmployeeIdNumber[i]=a;
    
    System.out.println("Please enter the value of array 2 input");
    int a1 = s.nextInt(); 
    EmployeeIdNumber_1[i]=a1;
    }
	System.out.println(Arrays.toString(EmployeeIdNumber));
	System.out.println(Arrays.toString(EmployeeIdNumber_1));
	Boolean b=Arrays.equals(EmployeeIdNumber, EmployeeIdNumber_1);
	System.out.println(b);
	s.close();
	
	}

}
