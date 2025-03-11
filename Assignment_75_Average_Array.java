package basicconcept;//Find out the average of all the numbers present in your array

public class Assignment_75_Average_Array {

	public static void main(String[] args) 
	{
	int a[]=new int [5];
	a[0]=12;
	a[1]=13;
	a[2]=14;
	a[3]=15;
	a[4]=16;
	 int sum=0;
	for (int i=0;i<=4;i++) 
	{
		System.out.println(a[i]);
		sum=sum +a[i];
	}
	System.out.println("Sum of an array is ");
	System.out.println(sum);
	//i=0;
	//a[0]=12
	//sum=0+12=12
	//i=1
	//a[1]=13
	//sum=12+13=25
	//i=2
	//a[2]=14
	//sum=25+14=39
	//i=3
	//a[3]=15
	//sum=39+15=54
	//i=4
	//a[4]=16
	//sum=54+16=70
	System.out.println("Average of an array is ");
	System.out.println(sum/a.length);
	}

}
