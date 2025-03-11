package basicconcept;//WAP to call one non static method in the main method

public class CallNonStaticMethods1 {
	void Addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) 
	{
	
		CallNonStaticMethods1 n=new CallNonStaticMethods1();//created an object and n is a reference variable
		n.Addition();//calling the non static method here
     
    
	}

}
