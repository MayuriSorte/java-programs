package basicconcept;//WAP for Method overloading for static and non static method. 

public class Method_Overloading_Static_NonStatic_2 {
    
	static void add (int a, int b)
	{

	    System.out.println("Addition");
	}
	
	void add (float a, float b)
	{
		
		System.out.println("Addition 2");
	}
	
	void add (int a, float b)
{
		
		System.out.println("Addition 3");
	}
	
	void add (float a, int b)
	{
		System.out.println("Addition 4");
	}
	
	static void add (float a, double b)
	{
		System.out.println("Addition 5");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        add(45,56);
        Method_Overloading_Static_NonStatic_2 m=new Method_Overloading_Static_NonStatic_2();
        m.add(5.9f,2.4f);
        m.add(67,7.2f);
        m.add(6.7f, 6);
        add(6.7f,8.9);
	}
	

}
