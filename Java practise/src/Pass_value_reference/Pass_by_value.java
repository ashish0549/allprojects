package Pass_value_reference;

public class Pass_by_value {
	String name="ClassTest";
	void show(String name1)
	{ 
	name=name1;
	System.out.println (name);
	
	}
	public static void main(String[] args) {
	Pass_by_value obj=new Pass_by_value();
	System.out.println(obj.name);// call by value
	obj. show ("MethodTest");// call by reference
}
}