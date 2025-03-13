package advanced_concept;//WAP on Compile time polymorphism (Method overloading)

public class Assign_118_Polymorphism_Overload 

{
	
	static void Age() 
	{
		int age=22;
		System.out.println(age);
	}
	
	static void Age(String name) 
	{
		int age=26;
		System.out.println(name);
		System.out.println(age);
	}
   public static void main(String[] args) 
  {
       Age();
       Age("Mayuri");
  }
}

