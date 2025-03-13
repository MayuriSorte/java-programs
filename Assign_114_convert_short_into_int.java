package advanced_concept;//WAP to convert short into int

public class Assign_114_convert_short_into_int {

	public static void main(String[] args) {
		//short datatype range =-32,768 to 32,767
		//int datatype range = -2147483648 to 2147483647

		int s =30000;//Implicit Widening
		System.out.println(s);
		
		int s1=(int) 31000;//explicit widening
		System.out.println(s1);
	}

}
