package basicconcept;//WAP with combination of 4 non static parameterized methods and try calling them inside main method

public class NonStaticParameterized {
 
	void add (int a, int b)
	{
		System.out.println(a+b);
	}
	
	void mul(double a, double b) 
	{
		System.out.println(a*b);
	}
	
	void div(float a, float b) 
	{
		System.out.println(a/b);
	}
	
	void mod(float a, float b) 
	{
		System.out.println(a%b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticParameterized n=new NonStaticParameterized();
		n.add(56, 34);
		n.mul(89.2, 42.1);
		n.div(76f, 12f);
		n.mod(76f, 12f);
	}

}
