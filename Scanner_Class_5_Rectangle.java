package basicconcept;//WAP to print Area and circumference of Rectangle using Scanner Class
import java.util.Scanner;
public class Scanner_Class_5_Rectangle {
	static void Area_Circumference_Of_Rectangle() 
	{	Scanner a=new Scanner(System.in);
		System.out.println("Please enter value of Length");
		double b=a.nextDouble();
		System.out.println("Please enter value of Width");
		double c=a.nextDouble();
		Double AreaOfRectangle=b*c;
		System.out.println("Area of Rectangle is   " + AreaOfRectangle);
		Double CircumferenceOfRectangle=2*(b+c);
		System.out.println("Circumference Of Rectangle  is  "+ CircumferenceOfRectangle);
		a.close();
	}
	public static void main(String[] args) 
	{   Area_Circumference_Of_Rectangle();

}}
