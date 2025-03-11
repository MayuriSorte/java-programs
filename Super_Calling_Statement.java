package basicconcept;
class Super_Calling_Statement_2 
{
	Super_Calling_Statement_2()
	{   
		int a=10;
		int b=2;
		int c=a%b;
		System.out.println("Remainder is   " + c);
	}
}
class Super_Calling_Statement_1 extends This_Calling_Statement
{
	Super_Calling_Statement_1(int a, int b )
	{   float c=a/b;
		System.out.println("Quotient is   " + c);
	}
}
public class Super_Calling_Statement extends Super_Calling_Statement_1
{   
	Super_Calling_Statement(int a, float b)
    {   super(20,4);
	    float c=a+b;
	    System.out.println("Addition is   " + c);	
    } 
	public static void main(String[] args)
	{
		new Super_Calling_Statement(10,2.5f);
	}
}
