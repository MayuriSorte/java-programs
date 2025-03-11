package basicconcept;//WAP for static and non static global variables and utilize them in both static and non static methods


public class Global_Variable_Static_NonStatic 
{  
	static int a;//contains 0 value when it is global variable
	static float d=23.4f;
    double b=9.45f;
	byte c=4;

	static void add()
    {
    	System.out.println(a);
    }
	
	void mul() 
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		add();
		Global_Variable_Static_NonStatic n =new Global_Variable_Static_NonStatic();
		n.mul();
        
	}

}