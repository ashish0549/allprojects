package Pass_value_reference;
class user_pass
{
	String username;
	String password;
}

public class Username_password {
	static void update_credentials (user_pass up)
{
	up.username="admin123" ;
	up. password="Pass@123";
}
	
	public static void main(String[] args) 
	{
	user_pass up=new user_pass (); up.username="User123";
	up.password="User@123"; update_credentials (up);
	System.out.println("Username="+up.username);
	System.out.println("'password="+up.password);
	
	}

}
