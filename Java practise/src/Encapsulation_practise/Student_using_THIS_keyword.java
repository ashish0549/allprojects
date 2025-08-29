package Encapsulation_practise;

public class Student_using_THIS_keyword {
	int rollno, age;
	String name, collegename, address;
	float per;
	void details(int rollno, String name, float per)
	{
	   this.rollno=rollno;
	   this.name=name; 
	   this.per=per;
	   System.out.println("rollno="+rollno);
	   System.out.println("Name="+name);
	   System.out.println("per="+per);
	}
	void details (int rollno, String name)
	{
	this.rollno=rollno;
	this.name=name;
	System.out.println("rollno="+rollno);
	System.out.println ("Name="+name);


	}
	public static void main(String[] args) {
		Student_using_THIS_keyword s=new Student_using_THIS_keyword();
		s.details(101, "Suhas", 90.90f);
		s.details(102,"Raghav");
	}
	}
