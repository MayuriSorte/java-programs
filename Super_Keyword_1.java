package basicconcept;//WAP on Super Keyword

class Super_Keyword_2
{   void add() 
	{
		int a =67;
		int b=87;
		float c=a+b;
		System.out.println("Addition is   " + c);
	
	}
}
public class Super_Keyword_1 extends Super_Keyword_2
{
	void add() 
	{   super.add();
		int a =67;
		int b=89;
		float c=a-b;
		System.out.println("");
		System.out.println("Subtraction is   " + c);
	}
	public static void main(String[] args) 
	{
		Super_Keyword_1 n = new Super_Keyword_1();
		n.add();

	}

}
