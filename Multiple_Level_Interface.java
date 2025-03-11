package basicconcept;//WAP on Multiple Level Inheritance

interface Multiplelevel_Inheritance_Interface_Concept 
{
 void add();
}
interface Multiplelevel_Inheritance_Interface_Concept_1
{
 void sub();
}

public class Multiple_Level_Interface implements Multiplelevel_Inheritance_Interface_Concept,
Multiplelevel_Inheritance_Interface_Concept_1
{
	public static void main(String[] args) 
	{
		Multiple_Level_Interface s = new Multiple_Level_Interface();
	    s.add();
	    s.sub();
	}
	public void sub() 
	{ int a=89;
    int b=76;
    int c=a-b;
    System.out.println("Subtraction is   "+ c); 		
	}
	
	public void add() 
	{
		int a=89;
		 int b=76;
		 int c=a+b;
		 System.out.println("Addition is   "+ c);
		
	}
}