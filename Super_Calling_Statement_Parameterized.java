package basicconcept;

class Super_Calling_Statement_Parameterized_3
{
	
	Super_Calling_Statement_Parameterized_3(float a, int b)
	{   
		
		float c=a%b;
		System.out.println("Remainder 1 is   " + c);
	}
}

class Super_Calling_Statement_Parameterized_2 extends 
Super_Calling_Statement_Parameterized_3
{
	
	Super_Calling_Statement_Parameterized_2(int a, float b) 
	{   
		super(20.5f,5);
		float c=a%b;
		System.out.println("Remainder 2 is   " + c);
	}
}

public class Super_Calling_Statement_Parameterized extends 
Super_Calling_Statement_Parameterized_2
{
	Super_Calling_Statement_Parameterized(int a, int b)
	{   super(20,2.5f);
		int c=a+b;
		System.out.println("Addition is   " + c);
	}
	public static void main(String[] args) 
	{
		new Super_Calling_Statement_Parameterized(20,4);

	}

}
