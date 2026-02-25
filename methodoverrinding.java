//METHOD OVERRIDING 
class Animal {
    void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    @Override
    void move() {
        System.out.println("Dogs move");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();

        a.move();  // Calls Animal's move()
        b.move();  // Calls Dog's move() (runtime polymorphism)
    }
}