package Basic_OOPs;

public class Employee {

    Employee() // no argument constructor
    {
        System.out.println("Default constructor");
    }

    Employee(int id, String name) // parameterized constructor
    {
        System.out.println("Id is=" + id);
        System.out.println("Name is=" + name);
    }

    Employee(String name, int id) // parameterized constructor
    {
        System.out.println("Name is=" + name);
        System.out.println("Id is=" + id);
    }

    Employee(String name, int id, float salary) // parameterized constructor
    {
        System.out.println("Name is=" + name);
        System.out.println("Id is=" + id);
        System.out.println("Salary=" + salary);
    }
}

	