package basicconcept;//WAP with combination of 3 static parameterized methods and try calling try calling them inside main method

//I want to store the result in varible and want the exact output like 100-50=50 

public class StaticParameterized 
{
      static void add (int a, int b)
      {
    	
	    System.out.println(a+b);
      }
      
      static void div (float a, float b)
      {
    	  System.out.println(a/b);
      }
      
      static void mod (double a, double b)
      {
    	  System.out.println(a%b);
      }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		add(34,65);
		div(12, 4);
		mod(12 ,4);
		
	}

}
