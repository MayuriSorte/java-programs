package basicconcept;//WAP to print Area and Circumference of Square using Scanner Class

import java.util.Scanner;
public class Scanner_Class_4_Square {
	static void Area_Circumference_Of_Square() 
	{	Scanner a=new Scanner(System.in);
		System.out.println("Please enter value of Side");
		double b=a.nextDouble();
		Double AreaOfSquare=b*b;
		System.out.println("Area of Square is   " + AreaOfSquare);
		Double CircumferenceOfSquare=4*b;
		System.out.println("Circumference Of Square  is  "+ CircumferenceOfSquare);
		a.close();
	}
	public static void main(String[] args) 
	{   Area_Circumference_Of_Square();

}}
