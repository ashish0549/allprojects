package Interface_practise;
interface Animal{
	void eat();    //public and abstract
	void sound();
	default void show() 
	{
		System.out.println("Hello");
	}

class Dog implements Animal
{
 public void eat() 
 {
	 System.out.println("Royal Canin");
 }
 public void sound() 
 {
	 System.out.println("Barking");
 }
}
public class Animal_demo {

	public static void main(String[] args) {
	Dog max=new Dog();
	max.eat();
	max.sound();

	}
}
}

//class-class= extends
//interface-interface=extends
//interface-class=implements