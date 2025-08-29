package Inheritance_practise;

class Animal 
{
    void eat(String eats) {
        System.out.println("Eats=" + eats);
    }

    void sound(String sd) {
        System.out.println("Sound=" + sd);
    }
}

class D_animal extends Animal {
    void lives(String live) {
        System.out.println("Lives in the " + live);
    }
}

public class Animal_Demo {
    public static void main(String[] args) {
        D_animal dog = new D_animal();
        System.out.println("**********Dog************");
        dog.eat("Royal canin");
        dog.sound("Barking");
        dog.lives("city");

        System.out.println("**********Cat************");
        D_animal cat = new D_animal();
        cat.eat("Fish");
        cat.sound("Meow");
        cat.lives("city");

        System.out.println("**********Cow************");
        // presumably continuing similarly for cow...
    }
}




//Multi Level Inheritance
/*
 package Inheritance_practice;

class Animal {
    void eat(String eats) {
        System.out.println("Eats=" + eats);
    }

    void sound(String sd) {
        System.out.println("Sound=" + sd);
    }
}

class D_animal extends Animal {
    void lives(String live) {
        System.out.println("Lives in the " + live);
    }
}

public class Animal_demo {
    public static void main(String[] args) {
        D_animal dog = new D_animal();
        System.out.println("**********Dog************");
        dog.eat("Royal canin");
        dog.sound("Barking");
        dog.lives("city");

        System.out.println("**********Cat************");
        D_animal cat = new D_animal();
        cat.eat("Fish");
        cat.sound("Meow");
        cat.lives("city");

        System.out.println("**********Cow************");
        // presumably continuing similarly for cow...
    }
}
*/
