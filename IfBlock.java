package basicconcept;//WAP on if block

public class IfBlock 
{
	
    public static void main(String[] args) 
    {
    	int a=25;
    	int b=15;
    	int c=25;
    	
	     if(a==c)
	     {
		   System.out.println("True");//True
	     }
	     if(a>b)
	     {
	    	 System.out.println(a);//True
	     }
	     if(a<b)
	     {
	    	 System.out.println(b);//False
	     } 
	     if(a>=b)
	     {
	    	 System.out.println(25);//True
	     }	
	     if(a<=b)
	     {
	    	 System.out.println(15);//False
	     }
	     if(a!=b)
	     {
	    	 System.out.println(c);//True
	     }	
	     
    }
}
