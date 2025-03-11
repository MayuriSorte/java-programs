package basicconcept;
class Super_Calling_Statement_NonParameterized_1
{   
	
	Super_Calling_Statement_NonParameterized_1()
	{	
		double pivalue=Math.PI;
		float r=5;
		double Circumference_of_Circle=2*pivalue*r;
		System.out.println("Circumference of Circle  " + Circumference_of_Circle);
		
	}
	
}
public class Super_Calling_Statement_NonParameterized extends 
Super_Calling_Statement_NonParameterized_1

{
	Super_Calling_Statement_NonParameterized()
	{   
		double pivalue=Math.PI;
		float r=5;
		double Area_of_Circle=pivalue*r*r;
		System.out.println("Area of Circle  " + Area_of_Circle);
	}
	public static void main(String[] args) 
	{
		
    new Super_Calling_Statement_NonParameterized();
	}

}
