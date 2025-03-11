package basicconcept;//WAP on SIB and IIB
public class Assignment_60_SIB_IIB {	
static int a;
static int b;
static int c;
static int d;
static int e;
static int f;

static //SIB
{   a=7;
	b=9;
	d=a-b;
	System.out.println("This is Static Initialization Block");
}
{   a=9;
	b=3;
	f=a/b;
	System.out.println("This is Instance Initialization Block 1 ");
}
Assignment_60_SIB_IIB()//constructor
{   
	System.out.println( "Multiplication is   " + e);
	System.out.println( "Division is   " + f);
}
static void addSub()
{   System.out.println( "Addition is   " + c);
	System.out.println( "Subtraction is   " + d);
}
public static void main(String[] args) 
{
	addSub();	//Calling static Method
	new Assignment_60_SIB_IIB();//Calling IIB	
}
}
