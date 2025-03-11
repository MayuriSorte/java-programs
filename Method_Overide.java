package basicconcept;//WAP on method overriding
 
class Method_Overide_1
{
	void add() 
	{
		int a =67;
		int b=87;
		float c=a+b;
		System.out.print("Addition is   " + c);
	}
}
public class Method_Overide extends Method_Overide_1
{
	void add() 
	{
		int a =67;
		int b=89;
		float c=a-b;
		System.out.print("Subtraction is   " + c);
	}
	public static void main(String[] args) 
	{
		Method_Overide n = new Method_Overide();
		n.add();

	}

}
