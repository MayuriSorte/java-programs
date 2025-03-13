package advanced_concept;//WAP on Class Typecasting to achieve 
//Upcasting(in implicit and explicit way) and Downcasting with overiding
//where there are two duplicate method in parent and class class, 
//it will call the child class method
class Android_1
{
	void Samsung()
	{
		System.out.println("I am a samsung galaxy A31");
	}	
}
class Apple_1 extends Android_1
{
	void Samsung()
	{
		System.out.println("I am a latest version of Sasung, I am not from Iphone family");
	}	
	void Vodaphone() 
	{
		System.out.println("I am a latest version of Vodaphone");
	}	
}
public class Assign_116_A_upcasting_downcasting_overriding 
{
public static void main(String[] args) 	
	{
		//Upcasting
		Android_1 a = new Apple_1();
		a.Samsung();
		//no child method is coming in list as Upcasting done
		
		
		//Downcasting
		//all the child class methods will display in list
		Apple_1 b	=(Apple_1)a;
		b.Vodaphone();
        b.Samsung();						
	}

}
