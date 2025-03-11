package basicconcept;

import java.util.Scanner;

public class This_Calling_Statement {
	static Scanner a = new Scanner (System.in);
	static float r;
	static double c;
	This_Calling_Statement()
	{   
	    double pivalue=Math.PI;
		r=a.nextFloat();
		double Area = pivalue*r*r;
		System.out.println("Area of circle is   " + Area);
		
	}
	
	This_Calling_Statement(float r)
	{   this();
	System.out.println("Enter the radius value");
		double pivalue=Math.PI;
	    r=a.nextFloat();
		double circumference = 2*pivalue*r*r;
		System.out.println("Circumference of circle is   " + circumference);			
	}
	
	This_Calling_Statement(double c)
	{   this (6.6f);
		double pivalue=Math.PI;
		c=a.nextDouble();
		double Square = 2*pivalue*c*c;
		System.out.println("Area of Square is   " + Square);
	}
	public static void main(String[] args) {
		new This_Calling_Statement(5);
		a.close();
	}

}
