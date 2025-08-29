
//Here "this." keyword is used to call another method into another method

package Encapsulation_practise;

public class Test {
	void setname (String name)
	{
	    System.out.println(name);
	}
	
	void getname() 
	{
	
	   this.setname ("Mittal shah");
	   System.out.println("Welcome to Java Learning sessions");
	
	}
	
public static void main(String[] args) 
   {
	Test t=new Test ();
	t. getname();
	}

}
