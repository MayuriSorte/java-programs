package basicconcept;//WAP for updating local and  global variables

public class Update_Local_Global_Variable 
{
    static int a=20;
    static int d=67;
    float b=56.5f;
    float c=7.6f;

    
    
    void sub()
    {
    	c=3.5f;
    	System.out.println(b-c);
    }
    
    static void add() 
    {
    	a=34;
    	System.out.println(a+d);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      add();
       Update_Local_Global_Variable n =new Update_Local_Global_Variable();
       n.sub();
	}

}
