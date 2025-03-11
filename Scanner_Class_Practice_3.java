package basicconcept;

import java.util.Scanner;

public class Scanner_Class_Practice_3 
{
	static void AreaOfCircle(Double PiValue, Float r)
	{
		double Area_of_circle=PiValue*r*r;
		System.out.println("Area of circle is   " + Area_of_circle);		
		
	}
	static void CircumferenceOfCircle(Double PiValue, Float r)
	{
		double Circumference_of_circle=2*PiValue*r;
		System.out.println("The Circumference of circle   "+ Circumference_of_circle);
	} 
	
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		double  PiValue = Math.PI;
		System.out.println("Please enter the radius");
		Float r = a.nextFloat();
        AreaOfCircle(PiValue, r);	       
       CircumferenceOfCircle(PiValue, r);
       a.close();	
	}
}

