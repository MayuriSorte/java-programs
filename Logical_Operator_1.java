package basicconcept;//WAP on logical operators with AND, OR, AND-NOT and Or-not

public class Logical_Operator_1 {

	public static void main(String[] args) 
	{
		int a=20;
		int b=40;
		int c=65;
		
		if (a==b && b==c)
		{
			System.out.println("If condition are satisfied");
		}
		if(a<=b || b>=c)
		{
			System.out.println("Else If condition 1 is satisfied");
		}
		if(!(a<=b && b>=c))
		{
			System.out.println("Else If condition 2 is satisfied");
		}
	    if(!(a<=b || b>=c))
		{
			System.out.println("Else If condition 3 is satisfied");
		}
		

	}

}
