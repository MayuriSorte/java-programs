package basicconcept; //WAP to call static method inside the main method.
public class CallStaticMethods {
	static void Addition()
	{   int a=45;
		int b=67;
		int sum=a+b;
		System.out.println(sum);
	}	
	static void Add()
	{   int a=45;
		int b=67;
		System.out.println(a+b);/*this is also possible , its just you are not storing the result into any variable*/
	}	
	static void Subtraction() 
	{   long c=6756767;
		long d=467677;
		long Sub=c-d;
		System.out.println(Sub);
	}	
	static void Multiplication() 
	{   long a=6756767;
		long b=467677;
		long Mul=a*b;
		System.out.println(Mul);
	}	
	static void Division() 
	{   long a=6756767l;
		long b=467677l;
		long Div=a/b;
		System.out.println(Div);
	}	
	static void Modulus() 
	{
		long a=6756767;
		long b=467677;
		long Mod=a%b;
		System.out.println(Mod);
	}
	public static void main(String[] args) 
	{
		Addition();
		Add();
		Subtraction();
		Multiplication();
		Division();
		Modulus();
		
	}

}
