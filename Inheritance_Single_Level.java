package basicconcept;//WAP on Single Level Inheritance
import java.util.Scanner;
class Inheritance_Single_Level_1 
{   static Scanner s= new Scanner(System.in);
	static void Area()
	{   Double Pivalue=Math.PI;
	    System.out.println("Please enter the value of Radius");
		Double r=s.nextDouble();
		Double area=Pivalue*r*r;
		System.out.println("The value of Area is " +    area);
		System.out.println("");
	}	
}
public class Inheritance_Single_Level extends Inheritance_Single_Level_1
{   static void Circumference () 
	{   Double Pivalue=Math.PI;
	    System.out.println("Please enter the value of Radius");
		Double r=s.nextDouble();
		Double circumference=2*Pivalue*r;
		System.out.println("The value of Circumference is " +    circumference);
	}
	public static void main(String[] args) 
	{   Area();
		Circumference();
        s.close();
	}
}
