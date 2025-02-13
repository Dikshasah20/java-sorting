public class multilevelInh27 {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);//eats 4
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}

// hierarchial inheritance
/*
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    } 
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    } 
}
     */
    

     

     

     

     










     


     
     




     public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println("Dobby has " + dobby.legs + " legs");
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammal {
    String breed;

    void bark() {
        System.out.println("barks");
    }
}

// Hierarchical Inheritance
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}















