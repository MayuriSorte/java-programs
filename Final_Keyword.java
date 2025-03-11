package basicconcept;//WAP to avoid Method Overriding using Final Method

class Final_Keyword_2
{   final void add() 
	{
		int a =67;
		int b=87;
		float c=a+b;
		System.out.println("Addition is   " + c);
	
	}
}
public class Final_Keyword extends Final_Keyword_2
{
	void add(int a, int b) 
	{   
		float c=a-b;
		System.out.println("");
		System.out.println("Subtraction is   " + c);
	}
	public static void main(String[] args) 
	{
		Final_Keyword n = new Final_Keyword();
		n.add();
		n.add(65,76);

	}

}