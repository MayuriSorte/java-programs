package basicconcept;

public class Inheritance_Heirarchical_Level_C extends Inheritance_Heirarchical_Level_A
{
	void add() 
	  { 
		 Float addition = l+b;
		 System.out.println("Addition is  " + addition );		 
	 }

	public static void main(String[] args) 
	{
		Inheritance_Heirarchical_Level_A.Area_of_Rectangle();
		Inheritance_Heirarchical_Level_C k = new Inheritance_Heirarchical_Level_C();
		k.add();
	}

}
