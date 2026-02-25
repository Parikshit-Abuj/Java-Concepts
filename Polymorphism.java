//POLYMORPHISM
//BY METHOD OVERRIDING, USES INHERITANCE
public class Animal {
    public void makeSound() {
        System.out.println("animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Dog();   // Parent reference, child object
        Animal a2 = new Cat();   // Parent reference, child object

        a1.makeSound();  // Calls Dog's version
        a2.makeSound();  // Calls Cat's version
    }
}

// Method Overloading Example
public class Overloading {

    // Method with 2 parameters
    int age(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 parameters
    double age(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();

        System.out.println(o.age(10, 23));      // Calls 2-parameter method
        System.out.println(o.age(10, 23, 45));  // Calls 3-parameter method
    }
}	