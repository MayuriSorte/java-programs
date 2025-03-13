package advanced_concept;//WAP on Run time polymorphism (Method overriding)
class polymorphism_1
{
	static void Addition(int age1, int age2) 
	{
		
		System.out.println(age1+age2);
	}
}
public class Assign_117_Polymorphism_Overide extends polymorphism_1
{ 
	
	
	
	void Subtraction(int age1, int age2) 
	{
		int age=age1-age2;
		System.out.println(age);
	}
   public static void main(String[] args) 
   {
	Addition(22,78);
	Assign_117_Polymorphism_Overide a = new Assign_117_Polymorphism_Overide();
	a.Subtraction(67,23);
   }
}

