package Inheritance_practise;
class Hussain
{
  void surname()
  {
	 System.out.println("Hussain");
	 
  }
  void Flat() 
  {
	  System.out.println("2BHK Flat");
  }
  void Car() 
  {
	  System.out.println("Ford Car");
	  
  }
}
class Nasir extends Hussain
{
	void Bike() 
	{
	  System.out.println("Pulsar");	
	}
	void Job() 
	{
		System.out.println("Project Engineer");
	}
}

public class Family {

	public static void main(String[] args) {
		Nasir son=new Nasir();
		System.out.println("Nasir"); 
		
		son.surname();
		son.Flat();
		son.Bike();
		son.Car();
		son.Job();
		

	}

}
