
//Method overloading
/*
 Method overloading in Java is a feature that allows a class to have more than one method 
 with the same name but different parameter lists (number, type, or order of parameters).
 
***Rules for Method Overloading:-
To overload a method in Java:

The method name must be the same.
The parameter list must be different (either in number, type, or order).
The return type can be different, but it does NOT contribute to method overloading.

It increases the readability of the program and allows you to perform a similar operation in different ways
*/

package Polymorphism_practise;

public class Student {
	void details(int rollno)
	{
		System.out.println("Rollno="+rollno);
	}
	
	void details(int rollno,String name)
	{
		System.out.println("Rollno="+rollno);
		System.out.println("Name ="+name);
	}
	void details(String name,int rollno)
	{
		System.out.println("Name ="+name);
		System.out.println("Rollno="+rollno);		
	}
	void details(int rollno,String name, float per)
	{
		System.out.println("Rollno="+rollno);
		System.out.println("Name ="+name);
		System.out.println("Percentage="+per);
	}
 
public static void main(String[] args) {
		Student stud=new Student();
		System.out.println("***student  rollno********");
		stud.details(101);
		System.out.println("***student rollno and name********");
		stud.details(102, "Neeva Sharma");
		System.out.println("***student name and rollno********");
		stud.details("Reeva Verma", 103);
		System.out.println("***student rollno, name and percentage********");
		stud.details(104, "Shiva Upadhyay", 89.9f);
 
	}
 
}

