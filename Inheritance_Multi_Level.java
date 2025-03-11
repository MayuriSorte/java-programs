package basicconcept;
import java.util.Scanner;
class Inheritance_Multi_Level_3
{  static Scanner s=new Scanner (System.in);	 
	static void Area_Of_Triangle() 
	{   System.out.println("Please enter base value");
		float b=s.nextFloat();
		System.out.println("Please enter height value");
		float h=s.nextFloat();
		double area =0.5*b*h;
		System.out.println("Area of triangle " +     area);
		System.out.println("");
	}	
}
class Inheritance_Multi_Level_2 extends Inheritance_Multi_Level_3
{   static void Circumference_Of_Triangle() 
	{System.out.println("Please enter side value");
	float A=s.nextFloat();
	System.out.println("Please enter side value");
	float B=s.nextFloat();
	System.out.println("Please enter side value");
	float C=s.nextFloat();
	double circumference =A+B+C;
	System.out.println("Circumference of triangle " +      circumference);
	System.out.println("");
	}
}
class Inheritance_Multi_Level_1 extends Inheritance_Multi_Level_2
{   
	static void AreaOfSquare()
	
		{System.out.println("Please enter value of side");
		float b=s.nextFloat();		
		double Area =b*b;
		System.out.println("Area of Square  " +     Area);
		System.out.println("");
		}
}
public class Inheritance_Multi_Level extends Inheritance_Multi_Level_1
{   static void CircumferenceOfSquare() {
	System.out.println("Please enter base value");
	float b=s.nextFloat();
	double circumference =4*b;
	System.out.println("Circumference  of Square is  " +  circumference);
	System.out.println("");
	}	
	public static void main(String[] args) 
     {
		Area_Of_Triangle();
		Circumference_Of_Triangle();
		AreaOfSquare();
		CircumferenceOfSquare();
		s.close();
	 }
}