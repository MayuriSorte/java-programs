package basicconcept;//WAP to reverse a string

public class Assignment_70_Reverse_String {

	public static void main(String[] args) {
		String a="Mayuri";
		String Reverse="";
		
		for (int i=a.length()-1;i>=0;i--)
		{
			char b=a.charAt(i);
			Reverse = Reverse + b;
		}
		System.out.println(Reverse);
			//i=5
			//b=i
			//Reverse = nothing + b=i
			//i=4
			//b=r
			//Reverse = i + r=ir
			//i=3
			//b=u
			//reverse=ir+u=iru
			//i=2
			//b=y
			//Reverse = iru+y=iruy
			//i=1
			//b=a
			//Reverse=iruy+a=iruya
			//i=0
			//b=m
			//Reverse=iruya+m=iruyam
			
			
		}

	}


