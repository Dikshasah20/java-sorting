public class Inheritance26 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
//Base class
class Animal {
    String color; //properties

    void eat(){// function
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breaths");
    }
}
// Derived class

class Fish extends Animal{// extends = khichna
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}






