
package basicconcept;//WAP on Constructor Overloading

public class Constructor_Overloading 

{
	Constructor_Overloading()
	{
		System.out.println("This is a constructor");
	} 
	
	Constructor_Overloading(int a, float b)
	{
		System.out.println(a+b);
	} 
	
	Constructor_Overloading(float b, int a)
	{
		System.out.println(b-a);
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor_Overloading a = new Constructor_Overloading();
		new Constructor_Overloading();
		new Constructor_Overloading(45,67.5f);
		new Constructor_Overloading(45.6f,32);
		new Constructor_Overloading(45.6f,32);
	}

}
