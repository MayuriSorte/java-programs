package basicconcept;//WAP for Method overloading for static and non static method. 

public class MethodOverloading_Static_NonStatic {
    
	static void add ()
	{
		int a=34;
		int b=54;
	    int sum=a+b;
	    System.out.println(sum);
	}
	
	void sub()
	{
		float a=6.5f;
		float b=4.1f;
		float sub=a-b;
		System.out.println(sub);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        add();
        MethodOverloading_Static_NonStatic m=new MethodOverloading_Static_NonStatic();
        m.sub();
        
	}
	

}
