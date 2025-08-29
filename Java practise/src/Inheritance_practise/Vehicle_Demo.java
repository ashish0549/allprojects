
//Multi-Level Inheritance
package Inheritance_practise;

class Vehicle 
{
 void info() 
 {
     System.out.println("General Vehicle");
 }
}


class FourWheeler extends Vehicle 
{
 void wheels() 
   {
     System.out.println("This vehicle has four wheels.");
   }
}


class PetrolFourWheeler extends FourWheeler 
{
 void fuelType() 
  {
     System.out.println("Runs on petrol.");
  }
}


class FiveSeaterPetrolFourWheeler extends PetrolFourWheeler 
{
 void seating() 
  {
     System.out.println("It seats five people.");
  }
}


class Baleno extends FiveSeaterPetrolFourWheeler 
{
 void model() 
  {
     System.out.println("Model: Baleno");
  }
}


public class Vehicle_Demo 
{
 public static void main(String[] args) 
  {
     Baleno myCar = new Baleno();
     myCar.info();       
     myCar.wheels();     
     myCar.fuelType();   
     myCar.seating();    
     myCar.model();     
  }
}
