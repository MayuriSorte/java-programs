package basicconcept;//WAP on Access specifiers within package for methods
class animal
{
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
}
public class Assignment_55_Access_Specifier_Package extends animal
{

	public static void main(String[] args) 
	{
		animal.Animal();
		animal.Bird();
		//animal.Plants();This method is not visible in list as it is Private. 
		//Private methods will not be accessible in different class within same package
		Assignment_55_Access_Specifier_Package a = new Assignment_55_Access_Specifier_Package(); 
		animal.Tree();

	}

}
