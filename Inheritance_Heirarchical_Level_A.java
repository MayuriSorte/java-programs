package basicconcept;

import java.util.Scanner;

public class Inheritance_Heirarchical_Level_A {
	 static Scanner a = new Scanner(System.in);
     static float l;
     static float b;
	static void Area_of_Rectangle() 
	{   System.out.println("Please enter length value");
	    l= a.nextFloat();
	    System.out.println("Please enter base value");
	    b=  a.nextFloat();  
		float AreaOfRectangle = l*b;
		System.out.println("Area of Rectangle is    " +AreaOfRectangle );
		System.out.println("");
		System.out.println("");	
		a.close();
	}
	public static void main(String[] args) 
	{
		Area_of_Rectangle();
        
	}

}
