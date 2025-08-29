package Pass_value_reference;

public class Test_pass {
	public static void changepassword(String password) 
	{
	password="Newpassword";
	}
	public static void main (String[] args) {
	String password="OldPassword";
	changepassword (password);// pass reference
	System.out.println("Password method="+password);
	} 

}
