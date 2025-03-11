package basicconcept;

public class Final_Variable {

	final static int a=20;
    final static int d=67;
    final float b=56.5f;
    final float c=7.6f;

    void sub()
    {
    
    	System.out.println(b-c);
    }
    
    static void add() 
    {
    
    	System.out.println(a+d);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      add();
      Final_Variable n =new Final_Variable();
       n.sub();
	}

}
