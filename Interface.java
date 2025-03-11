package basicconcept;//WAP on Interface with 2 Abstract methods
 interface Amazon 
 {
	 void add();
	 void sub();
	 
 }
public class Interface implements Amazon
{
	
	public void add() 
	{
		int a=89;
		 int b=76;
		 int c=a+b;
		 System.out.println("Addition is   "+ c);
	}
	public void sub() 
	 {
		int a=89;
	    int b=76;
	    int c=a-b;
	    System.out.println("Subtraction is   "+ c);  
	 }
	public static void main(String[] args) 
	{
		
		Interface n = new Interface();
		n.add();
		n.sub();
		
	}

}
