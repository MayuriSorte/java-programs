package basicconcept;//WAP on Multi Level Inheritance using Interface Concept
interface Multi_level_Inheritance_Interface_Concept 
{
 void add();
}
interface Multi_level_Inheritance_Interface_Concept_1 extends Multi_level_Inheritance_Interface_Concept
{
 void sub();
}

public class Multi_Level_inheritance_Interface implements Multi_level_Inheritance_Interface_Concept_1
{

	public static void main(String[] args) 
	{
		Multi_Level_inheritance_Interface s = new Multi_Level_inheritance_Interface();
	   s. add();
	   s. sub();
	}

	public void sub() 
	{
		int a=89;
		 int b=76;
		 int c=a-b;
		 System.out.println("Addition is   "+ c);	
	}

	public void add() 
	{
		int a=89;
		 int b=76;
		 int c=a+b;
		 System.out.println("Addition is   "+ c);
		
	}

}
