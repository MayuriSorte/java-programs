package basicconcept;//WAP with combination of static and non static methods and try calling both of them

public class StaticNonStatic {
	
	static void add()
	{
		int a =76;
		int b =98;
		System.out.println(a+b);
	}
	void sub()
	{
		int a =76;
		int b =98;
		System.out.println(a-b);		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		add();
		StaticNonStatic n=new StaticNonStatic();
		n.sub();
    
	}

}
