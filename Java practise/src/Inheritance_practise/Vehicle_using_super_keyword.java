package Inheritance_practise;
class vehicle
{
	int speed =70;
}
class car extends vehicle
{
	int speed=100;
	void showspeed() 
	{
		System.out.println("car normal speed="+speed);//100
		System.out.println(this.speed);//100
		System.out.println("Vehicle Normal speed="+super.speed);//70
	}	
}

public class Vehicle_using_super_keyword 
{
   public static void main(String[] args)
   {
	 car c=new car();
	 c.showspeed();
	 
   }
}
