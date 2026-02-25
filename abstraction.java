// Abstraction used to hide data and complexity
abstract class Animal {
    abstract void makeSound();

    void sleeping() {
        System.out.println("sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal an = new Dog();
        an.makeSound();
        an.sleeping();
    }

}
