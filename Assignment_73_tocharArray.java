package basicconcept;//WAP on String Function using toCharArray concept

public class Assignment_73_tocharArray {

	public static void main(String[] args) {
		
    String a="Mayuri Rihaan";
   
    for (int i=0;i<=a.length()-1;i++) 
    {
    	 char c[]=a.toCharArray();
    	 System.out.print(c[0]);
    }
	}

}
