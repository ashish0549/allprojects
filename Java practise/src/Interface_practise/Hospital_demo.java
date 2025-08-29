
//Multiple Inheritance (Which cannot be possible in java) can be used using interface class//


package Interface_practise;
interface Doctor
{
 void operation();
 void OPD();
}
interface Nurse
{
 void checkup();
 void documentation();
}
interface Accountant
{
 void payments();
 void query();
}

public class Hospital_demo implements Doctor,Nurse,Accountant
{
	
	
    public void operation() {
        System.out.println("Performing surgery...");
    }

    public void OPD() {
        System.out.println("Conducting outpatient consultation...");
    }

   
    public void checkup() {
        System.out.println("Doing patient check-up...");
    }

    public void documentation() {
        System.out.println("Filling medical records...");
    }

    
    public void payments() {
        System.out.println("Processing payments...");
    }

    public void query() {
        System.out.println("Answering billing queries...");
    }

    public static void main(String[] args) {
        Hospital_demo hd = new Hospital_demo();
        hd.operation();
        hd.OPD();
        hd.checkup();
        hd.documentation();
        hd.payments();
        hd.query();
    }
}
