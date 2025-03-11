package basicconcept;//WAP on This Keyword

public class This_Keyword {
    float radius;
    double Pivalue;
    
    void Area(float radius) 
    {   
    	this.radius = radius;//assigned local variable value to global variable, 
    	//so 6 will be assigned to global variable radius
    	//radius=6;
        double Pivalue=Math.PI;
    	Double Area_of_Circle=Pivalue*radius*radius;
    	System.out.println("Area of circle  " + Area_of_Circle);
    }
	public static void main(String[] args) 
	
	{
		This_Keyword n= new This_Keyword();
        n.Area(6);
        System.out.println(n.radius);
        System.out.println(n.Pivalue);
	}

}
