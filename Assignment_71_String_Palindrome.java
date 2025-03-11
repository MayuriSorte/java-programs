package basicconcept;//WAP to check if the given string is a Palindrome?

public class Assignment_71_String_Palindrome {

	public static void main(String[] args) {
		String a="radar";
		String Reverse="";
		
		for (int i=a.length()-1;i>=0;i--)
		{
			char b=a.charAt(i);
			Reverse = Reverse + b;
		}
		System.out.println(Reverse);
			
		if (a.equals(Reverse))	
		{
			System.out.println("Given string Input is palindrome"); 
		}
		else 
		{
			System.out.println("Given string Input is not palindrome"); 
		}
			
		}

	}


