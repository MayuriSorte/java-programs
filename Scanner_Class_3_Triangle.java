package basicconcept;//WAP to print Area and circumference of Triangle using Scanner Class
import java.util.Scanner;
public class Scanner_Class_3_Triangle {
	static void Area_Circumference_Of_Triangle() 
	{	Scanner a=new Scanner(System.in);
		System.out.println("Please enter value of Base");
		double b=a.nextDouble();
		System.out.println("Please enter value of Height");
		Double h=a.nextDouble();
		Double AreaOfTriangle=0.5*b*h;
		System.out.println("Area of Triangle is   " + AreaOfTriangle);
		System.out.println("Please enter value of A");
		double A=a.nextDouble();
		System.out.println("Please enter value of B");
		Double B=a.nextDouble();
		System.out.println("Please enter value of c");
		Double C=a.nextDouble();
		Double CircumferenceOfTriangle=A+B+C;
		System.out.println("Circumference Of Circle   "+ CircumferenceOfTriangle);
		a.close();
	}
	public static void main(String[] args) 
	{   Area_Circumference_Of_Triangle();
	}

}
