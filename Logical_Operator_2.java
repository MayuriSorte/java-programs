package basicconcept;//WAP to check a person can vote only if he/she is 18 or above and should not vote if age is less

public class Logical_Operator_2 {

	public static void main(String[] args) 
	{
		int RamanAge=18;
		
		if (RamanAge==18 || RamanAge>18) 
		{
			System.out.println("Raman can Vote");
		}
		else
		{
			System.out.println("Raman can't Vote");
		}

	}

}
