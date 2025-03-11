package basicconcept;//WAP on Access specifiers outside the package without becoming the subclass for methods
import basicconcept.Access_Specifier_Outside_Package1_Class;
public class Access_Specifier_out_Package_without_Class_for_Method 
{

	public static void main(String[] args) 
	{
		 
			Access_Specifier_Outside_Package1_Class.Animal();
			Access_Specifier_Outside_Package1_Class.Bird();
			//Access_Specifier_Outside_Package1_Class.Plants();//This method is not visible in list as it is Private. 
			//Private methods will not be accessible in different package.
			//Access_Specifier_Outside_Package1_Class.Tree();//default methods will not be accessible in different package.

	}

}
