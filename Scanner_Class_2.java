package basicconcept;//WAP to print Area and Circumference of Circle using Scanner Class by creating two different static method
import java.util.Scanner;//can we use scanner multiple times
public class Scanner_Class_2 
{
static	Scanner a = new Scanner(System.in);

	static void AreaOfCircle()
	{
		double PiValue = Math.PI;
		System.out.println("Please enter the radius");
		Float r = a.nextFloat();	
		double Area_of_circle=PiValue*r*r;
		System.out.println("Area of circle is   " + Area_of_circle);
	
	}
	static void CircumferenceOfCircle()
	{
		double PiValue = Math.PI;
		System.out.println("Please enter the radius");
		Float r = a.nextFloat();		
		double Circumference_of_circle=2*PiValue*r;
		System.out.println("The Circumference of circle   "+ Circumference_of_circle);		
		
	}
	
	public static void main(String[] args) 
	{
		
        AreaOfCircle();
        
       CircumferenceOfCircle();
       
       a.close();  
	}
}

