package basicconcept;

import java.util.InputMismatchException;

public class Assignment_63_Throws {
static int a=24;
	public static void main(String[] args) throws NullPointerException, InputMismatchException
	{
		//throw new NullPointerException();
	    //throw new InputMismatchException();
		if (a>25) 
		{
			throw new NullPointerException();
		}
		else 
		{
			throw new InputMismatchException();
		}

	}

}
