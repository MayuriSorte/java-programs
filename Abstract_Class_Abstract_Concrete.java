package basicconcept;//WAP on Abstract Class with both Abstract and Concrete methods
import java.util.Scanner;
abstract class Concrete
{   abstract void add();//abstract method
	abstract void sub();//abstract method	
	void multiply(int a, int b) 
	{  int c=a*b;
	   System.out.println("Multiplication is  "+ c);
	}	 
}
public class Abstract_Class_Abstract_Concrete extends Concrete
{    static void Area() 
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
    public static void main(String[] args) 
    {   Area();
		Abstract_Class_Abstract_Concrete n = new Abstract_Class_Abstract_Concrete();
		n.add();
		n.sub();
		n.multiply(5,6);
	}
}
