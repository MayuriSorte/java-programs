package basicconcept;//Write a Program on nested if Else Block_Case 

public class Nested_If_Else_Block_1 {

	public static void main(String[] args) 
	{
		char a='b';
		int  c='d';
		
		if(a!='b')
		{
			if(a==c) 
			{
			System.out.println("Oho");
			}
			else 
			{
				System.out.println("Above condition is incorrect");
			}
		}
		else
		{
			System.out.println("Welcome to Else");
		}	
	}

}
