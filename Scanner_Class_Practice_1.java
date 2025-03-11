package basicconcept;

import java.util.Scanner;

public class Scanner_Class_Practice_1 {

//final static double pi=3.14;
//final static double r = 5;

public static void main(String[] args) 
{
	Scanner a = new Scanner(System.in);
	System.out.println("Please enter the string input");
	System.out.println("");
	String name = a.next();
	System.out.println(name);
	a.close();
   
}



}
