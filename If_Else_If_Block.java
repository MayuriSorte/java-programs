package basicconcept;//WAP on if else if block

public class If_Else_If_Block {

	public static void main(String[] args) 
	{
		int a=56;
		int b=45;
		if (a<b)
		{
			System.out.println("It is Incorrect");
		}
		else if(a==b)
		{
			System.out.println("It is not correct");
		}
		else if (a>b) 
		{
			System.out.println("It is correct");
		}
		else if (b>a)
		{
			System.out.println("Its not right");
		}
		else
		{
			System.out.println("Both conditions are Incorrect");
		}	
		
	}
}
