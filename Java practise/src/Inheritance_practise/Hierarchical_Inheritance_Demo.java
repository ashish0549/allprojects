package Inheritance_practise;
//Base class
class Hospital {
 void hospitalInfo(String H_name) {
     System.out.println("This is "+H_name+" Hospital");
 }
}

//Nurse is a direct member of the hospital
class Nurse extends Hospital {
 void nurseInfo(String N_name) {
     System.out.println( N_name +" from Nurse Department ");
 }
}

//Accountant is a direct member of the hospital
class Accountant extends Hospital {
 void accountantInfo(String A_name) {
     System.out.println(A_name+" from Accountant Department");
 }
}

//Payments is part of Accountant
class Payments extends Accountant {
 void paymentInfo() {
     System.out.println("Handles Payments");
 }
}

//Documentation is part of Accountant
class Documentation extends Accountant {
 void documentationInfo() {
     System.out.println("Handles Documentation");
 }
}

//Doctor is also part of the Hospital
class Doctor extends Hospital {
 void doctorInfo() {
     System.out.println("Doctors performs operations based on their Specialization ");
 }
}

//Gynac is a specialization of Doctor
class Gynac extends Doctor {
 void gynacInfo(String D_name) {
     System.out.println("Dr."+D_name+" Gynecologist");
 }
}

//Endo is another specialization of Doctor
class Endo extends Doctor {
 void endoInfo(String D_name) {
     System.out.println("Dr."+D_name+ "Endocrinologist");
 }
}

//Cardiac is another specialization of Doctor
class Cardiac extends Doctor {
 void cardiacInfo(String D_name) {
     System.out.println("Dr."+D_name+" Cardiologist");
 }
}

//Operation is under Cardiac
class Operation extends Cardiac {
 void operationInfo() {
     System.out.println("Performs Cardiac Operations");
 }
}

//OPD is under Cardiac
class OPD extends Cardiac {
 void opdInfo() {
     System.out.println("Handles Cardiac OPD");
 }
}

//Main class to test the hierarchy
public class Hierarchical_Inheritance_Demo {
 public static void main(String[] args) {
     Operation op = new Operation();
     op.hospitalInfo("Omni");
     op.doctorInfo();
     op.cardiacInfo("Madhav");
     op.operationInfo();

     OPD opd = new OPD();
     opd.opdInfo();

     Payments pay = new Payments();
     pay.accountantInfo("Raju");
     pay.paymentInfo();

     Documentation doc = new Documentation();
     doc.documentationInfo();
 }
}



	