package advanced_concept;//WAP on Class Typecasting to achieve 
//Upcasting(in implicit and explicit way) and Downcasting without overiding

class Android
{
	void Samsung()
	{
		System.out.println("I am a samsung galaxy A31");

	}
	
}

class Apple extends Android
{
	void iphone()
	{
		System.out.println("I am Iphone 16 promax");

	}
	
}
public class Assign_116_upcasting_downcasting 
{

	public static void main(String[] args) 
	
	{
		//Upcasting
		Android A = new Apple();
		A.Samsung();
		//no child method is coming in list as Upcasting done
		
		//Downcasting
		
		Apple  Myapple =  (Apple) A;
		Myapple.iphone();

	}

}
