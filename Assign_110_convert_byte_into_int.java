package advanced_concept;//WAP to convert byte into int

public class Assign_110_convert_byte_into_int {

	public static void main(String[] args) {
		
		//byte data range -128 to 127
        //int datatype range = -2147483648 to 2147483647
		
		int i = 122;//implicit widening
		System.out.println(i);
	
		int i1 = (int) 120;//explicit widening
		System.out.println(i1);

	}

}
