package basicconcept;

public class Local_Variable_Static_NonStatic_Method_Overloading 
{
    static void add(int a)
    {
    	System.out.println("Print a");
    }
    
	static void add()
	{
		System.out.println("Print Nothing");
	}
	
	void add(int a, float b) 
	{
		System.out.println(a+b);
	}
	
	void add(int a, float b, double c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		add(50);
		add();
		Local_Variable_Static_NonStatic_Method_Overloading n=new Local_Variable_Static_NonStatic_Method_Overloading();
		n.add(16, 19.5f);
		n.add(65, 21.5f, 34.5);
        
	}

}