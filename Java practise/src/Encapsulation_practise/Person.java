package Encapsulation_practise;

class Person {
	private String name;
	public void setname(String name) {
		this.name=name;
	}
	public void getname(String name) {
		System.out.println("Person Name="+name);
		
	}
    public static void main(String[] args) {
    	Person p=new Person();
    	p.getname("Nasir Hussain");
    }
}
