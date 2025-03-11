package basicconcept;////  WAP to print Area and circumference of Circle using Scanner Class
import java.util.Scanner;
public class Scanner_Class_1_Circle {
	static void AreaOfCircle()
	{
		Scanner a = new Scanner(System.in);
		//System.out.println("Please enter the PiValue");
		//double PiValue = a.nextDouble();
		double PiValue = Math.PI;
		System.out.println("Please enter the radius");		
		double r = a.nextDouble();	
		
		double Area_of_circle=PiValue*r*r;
		double Circumference_of_circle=2*PiValue*r;
		System.out.println("Area of circle is : "    +     Area_of_circle);
		System.out.println("Circumference of circle is:  "    +   Circumference_of_circle);
		a.close();
		
	}	
	public static void main(String[] args) 
	{
		
        AreaOfCircle();
        
	}

}
