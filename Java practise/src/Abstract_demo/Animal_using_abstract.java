package Abstract_demo;
abstract class Animal
{
	 
	 void eat()
	 {
		 System.out.println("Eating");
		 
	 }
     abstract void sound();
}

class Dog extends Animal
{
	void sound()
	{
		System.out.println("Sound=Barking");
	}
}

class Tiger extends Animal
{  
	void sound()
	{
		System.out.println("Sound=Roarrr");
	}
}

public class Animal_using_abstract {

	public static void main(String[] args) {
		System.out.println("*****Dog******");
		Dog max=new Dog();
		max.eat();
		max.sound();
		System.out.println("*****Tiger****");
		Tiger shera=new Tiger();
		shera.eat();
		shera.sound();
	}

}
