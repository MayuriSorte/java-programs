package advanced_concept;//WAP on Encapsulation
 class Encapsulation 
 {
	 private String accountnumber="232343456767";
	 //declared the data member in a class 
	 //to not provide the direct access to anyone
	 //using getter and setter method , 
	 //we can give indirect access to anyone or fellow developer
	 //access specifier should always be Private for sensitive information
	 //for each data member , we need to create separate getter 
	 //and setter methods like for age, mobile number
	 
	 public String getAccountNumber() 
	 {
		 return accountnumber;
		 //return the data member/class variable
	 }
	 
	 public void setAccountNumber(String accountnumber)//need is to replace the value
	{
		 this.accountnumber=accountnumber;//local variable assigned into global variable
		 //local data member assigned to global data member
	}
 }
public class Assign_119_EncapProgram 

{
	public static void main (String [] args) 
	{
		 Encapsulation e = new Encapsulation();
		 e.setAccountNumber("657567767677");//setting different account number, 
		 //this will replace account number in private one
		 e.getAccountNumber();//fetching the account number
		 System.out.println(e.getAccountNumber());//printing the fetched one
		 e.setAccountNumber("1002");
		 System.out.println(e.getAccountNumber());//printing the fetched one
	}


}

