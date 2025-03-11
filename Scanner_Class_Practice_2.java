package basicconcept;

import java.util.Scanner;

public class Scanner_Class_Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a=new Scanner(System.in);
        System.out.println("Please enter the value of A");
        int A= a.nextInt();
        System.out.println("Please enter the value of B");
        int B = a.nextInt();
        int sum = A+B;
        System.out.println("Please enter the value of sum");
        System.out.println(sum);
        a.close();
	}

}
