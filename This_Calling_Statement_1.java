package basicconcept;

public class This_Calling_Statement_1 {
	This_Calling_Statement_1()
	{   
	    double pivalue=Math.PI;
		float r=6;
		double Area = pivalue*r*r;
		System.out.println("Area of circle is   " + Area);	
		
	}
	This_Calling_Statement_1(int r)
	{  this (6.5);
	    double pivalue=Math.PI;
		r=6;
		double Circumference = 2*pivalue*r;
		System.out.println("Circumference of circle is   " + Circumference);		
	}
	
	This_Calling_Statement_1(double s)
	{  this();
		s=6;
		double Area = s*s;
		System.out.println("Area of square is   " + Area);		
	}
	public static void main(String[] args) {
		
    new This_Calling_Statement_1(5);
	}

}
