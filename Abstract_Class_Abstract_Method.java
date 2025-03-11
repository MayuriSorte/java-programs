package basicconcept;//WAP on Abstract Class and Abstract Method
import java.util.Scanner;
abstract class Hide_1
{   abstract void add();//abstract method
	abstract void sub();//abstract method
}
public class Abstract_Class_Abstract_Method extends Hide_1
{
    static void Area() 
    {   Scanner s=new Scanner (System.in);
    	System.out.println("Please enter base value");
		float b=s.nextFloat();
		System.out.println("Please enter height value");
		float h=s.nextFloat();
		double area =0.5*b*h;
		System.out.println("Area of triangle " +     area);
		System.out.println("");
		s.close();
    }    
    void add() 
    {    int a=89;
    	 int b=76;
    	 int c=a+b;
    	 System.out.println("Addition is   "+ c);   
    }
    
    void sub() 
    {    int a=89;
    	 int b=76;
    	 int c=a-b;
    	 System.out.println("Subtraction is   "+ c);   
    }
	public static void main(String[] args) {
		Area();
		Abstract_Class_Abstract_Method n = new Abstract_Class_Abstract_Method();
		n.add();
		n.sub();   
	}

}
