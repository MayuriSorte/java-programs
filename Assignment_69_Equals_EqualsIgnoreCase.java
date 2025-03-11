package basicconcept;//WAP on String Function using equals and equalsIgnoreCase concept

public class Assignment_69_Equals_EqualsIgnoreCase {

	public static void main(String[] args) {
		String a="office";
		String b="OFFICE";
		Boolean c=a.equals(b);
        System.out.println(c);
        
        String d=b.toLowerCase();
        System.out.println(d);
        System.out.println(a.equals(d));
	}

}
