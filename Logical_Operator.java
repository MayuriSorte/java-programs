package basicconcept;//WAP on logical operators with AND, OR, AND-NOT and Or-not

public class Logical_Operator {

	public static void main(String[] args) 
	{
		int a=20;
		int b=40;
		int c=65;
		
		if (a==b && b==c)
		{
			System.out.println("If conditions is satisfied");
		}
		else if(a>=b || b>=c)
		{
			System.out.println("Else If condition 1 is satisfied");
		}
		else if(!(a<=b && b>=c))
		{
			System.out.println("Else If condition 2 is satisfied");
		}
		else if(!(a<=b || b>=c))
		{
			System.out.println("Else If condition 3 is satisfied");
		}
		else
		{
			System.out.println("Else condition is not satisfied");
		}

	}

}
