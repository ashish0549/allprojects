
//Refer current class constructor using "this." keyword
package Encapsulation_practise;

public class Test1 {
	Test1(String name)
	{
		System.out.println(name);
	}
	Test1()
	{
		this(" I'm from Test1 Parameterized constructor");
		System.out.println("Welcome to my space");
	}
public static void main(String[] args) {
	Test1 t=new Test1();
	
}
}
