package basicconcept;
import java.util.Scanner;
class Inheritance_1
{   static int a;
    static int b;
    static int sum;
    static int difference;
    static int mul;
    static Scanner s = new Scanner(System.in);
    
	static void add(int a, int b) 
	{
		System.out.println("Please enter the value of a");
				a=s.nextInt();
				System.out.println("Please enter the value of b");
				b=s.nextInt();
				sum = a+b;
				System.out.println("Sum is   :" + sum);				
	}
	static void sub(int a, int b) 
	{   System.out.println("Please enter the value of a");
				a=s.nextInt();
				System.out.println("Please enter the value of b");
				b=s.nextInt();
				difference = a-b;
				System.out.println("Difference  is   :" + difference);								
	}
}
public class Inheritance extends Inheritance_1{  
   // int a; this will also work
  // static int b; this will also work
   static int mul;
   
	static void Multiply(int a, int b) 
	{  
		System.out.println("Please enter the value of a");
				a=s.nextInt();
		System.out.println("Please enter the value of b");
				b=s.nextInt();
				mul = a*b;
		System.out.println("Multiplication  is   :" + mul);				
    }
public static void main(String[] args) 
	
{
		add(a,b);
		sub(a,b);
		Multiply(a,b);
		s.close();
}

}
