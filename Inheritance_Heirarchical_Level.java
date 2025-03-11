package basicconcept;
import java.util.Scanner;
class Inheritance_Heirarchical_Level_3
{    static Scanner a = new Scanner(System.in);
     static float l;
     static float b;
	void Area_of_Rectangle() //method
	{ 	System.out.println("Please enter length value");
	    l = a.nextFloat();
	    System.out.println("Please enter base value");
        b=  a.nextFloat();  
		float AreaOfRectangle = l*b;
		System.out.println("Area of Rectangle is    " +AreaOfRectangle );
		System.out.println("");
		System.out.println("");	
	}
}
class Inheritance_Heirarchical_Level_2 extends Inheritance_Heirarchical_Level_3
{   static void Circumference_Of_Rectangle() 
	{   float CircumferenceOfRectangle = 2 *(l+b);
		System.out.println("Circumference of Rectangle is    " +CircumferenceOfRectangle );
		System.out.println("");
		System.out.println("");
	} 
}
class Inheritance_Heirarchical_Level_1 extends Inheritance_Heirarchical_Level_3
{
	  void add() 
	  { Float addition = l+b;
		System.out.println("Addition is  " + addition );		 
	  }
}
public class Inheritance_Heirarchical_Level extends Inheritance_Heirarchical_Level_3

{	public static void main(String[] args) 
	{   Inheritance_Heirarchical_Level d = new Inheritance_Heirarchical_Level();
		d.Area_of_Rectangle();
		Inheritance_Heirarchical_Level_2.Circumference_Of_Rectangle();
		
		Inheritance_Heirarchical_Level_1 d1 = new Inheritance_Heirarchical_Level_1();
		d1.add();
		a.close();		
    }
}
