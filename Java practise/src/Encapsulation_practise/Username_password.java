package Encapsulation_practise;

class Username_password {
	 private String name="Nasir";
	 private String password;
	 public void setpass(String pass) {
		 this.password=pass;
	 }
	public void getname() {
		System.out.println("Name of the User = "+name);
	 }
    public void getpassword(String pass) {
    	System.out.println("Password = "+pass);
    }
    public static void main(String[] args) {
    	Username_password up=new Username_password();
    	up.getname();
    	up.getpassword("Secure");
    }
    
}

