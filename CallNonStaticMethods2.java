package basicconcept;//WAP to call 3 non static methods in the main method

public class CallNonStaticMethods2 {

	float a=10f;
	float b=20f;
	
	void add()
	{   int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void sub()
	{   float a=10f;
		float b=20f;
		System.out.println(a-b);
	}
	void mul()
	{   float a=10f;
		float b=20f;
		System.out.println(a*b);
	}
	void div()
	{   float a=10f;
		float b=20f;
		System.out.println(a/b);
	}
	public static void main(String[] args) 
	{   CallNonStaticMethods2 n =new CallNonStaticMethods2();
		n.add();
		n.sub();
		n.mul();
		n.div();
	
	}

}
