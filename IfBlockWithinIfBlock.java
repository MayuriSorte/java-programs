package basicconcept;//WAP on if block within if block

public class IfBlockWithinIfBlock {

	public static void main(String[] args) 
	{
		
	    	int a=25;
	    	int b=15;
	    	int c=25;
	    	
		     if(a==c)
		     {
			     if(b<c)
			     {	 
		    	     if(a>b)
		    	     {	 
			    	 System.out.println("Correct");//True
		    	     }
			     }
		     }
		     if(a>b)
		     {
		    	 System.out.println("Great");//True
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
