package basicconcept;

public class Inheritance_Heirarchical_Level_B extends Inheritance_Heirarchical_Level_A
{
	static void Circumference_Of_Rectangle() 
	
	{   
		System.out.println("Please enter length value");        
		float CircumferenceOfRectangle = 2 *(l+b);
		System.out.println("Circumference of Rectangle is    " +CircumferenceOfRectangle );
		System.out.println("");
		System.out.println("");
	
	} 
	public static void main(String[] args)
	{
		Inheritance_Heirarchical_Level_A.Area_of_Rectangle();
		Circumference_Of_Rectangle();

	}

}
