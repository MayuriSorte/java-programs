package basicconcept;//WAP on Access specifiers within class for methods

public class Assignment_54_Access_Specifier {

	
	public static void Animal()
	{
		System.out.println("Animals");
	}
	protected static void Bird()
	{
		System.out.println("Birds");
	}
	private static void Plants()
	{
		System.out.println("Plants");
	}
	static void Tree()
	{
		System.out.println("Trees");
	}
	public static void main(String[] args) 
	{
		Animal();
		Bird();
		Plants();
		Tree();
	}

}
