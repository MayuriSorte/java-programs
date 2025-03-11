package basicconcept;//WAP to declare a local variable inside a static and non static  Method. 

public class Local_Variable_Static_NonStatic {
    
	static void mul(int a, int b)
	{
	System.out.println("Multiplication");
	}
	
	void mod (double a, float b) 
	{
		System.out.println("Modulus");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        mul(65, 98);
        Local_Variable_Static_NonStatic l=new Local_Variable_Static_NonStatic();
        l.mod(65.9,23.5f);
	}

}
