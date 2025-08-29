package Pass_value_reference;
//Pass by value


public class Username_password1{
	String username,
	 password;
	static void update_credentials1(String username,
	String password)
	{
		username="admin123";
		password="Admin@123";
	}
	public static void main(String[] args) {
		Username_password1 up1=new Username_password1();
		up1.username="User123";
		up1.password="User@123";
		update_credentials1("admin123","Pass@123");
		System.out.println("Username="+up1.username);
		System.out.println("password="+up1.password);
	}

}