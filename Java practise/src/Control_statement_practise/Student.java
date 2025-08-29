package Control_statement_practise;

public class Student {
    int id, age;
    float per;
    String name; // instance variable / global variable
    static String company = "WIPRO"; // static variable common data

    void details(int id1, int age1, String name1, float per1) { // local variables
        id = id1;
        age = age1;
        per = per1;
        name = name1;

        System.out.println("ID=" + id);
        System.out.println("Age=" + age);
        System.out.println("Percentage=" + per);
        System.out.println("Name=" + name);
        System.out.println("company=" + company);
    }

    public static void main(String[] args) {
        Student stud = new Student();
        System.out.println("***1st student***");
        stud.details(100, 22, "Shiva", 98.8f); // for 1 student
        System.out.println("***2nd student***");
    }
}
