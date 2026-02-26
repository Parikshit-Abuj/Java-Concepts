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

/*
ABSTRACT CLASS – DO’s and DON’Ts IN JAVA
*/

/* 1) Reference allowed, object NOT allowed */

abstract class Test {
}

class Main1 {
    public static void main(String[] args) {
        Test t;          // ✅ Allowed
        // t = new Test();  // ❌ Error: Cannot instantiate abstract class
    }
}


/* 2) abstract + final class ❌ NOT allowed */

// abstract final class Test2 { }
// ❌ Error because:
// abstract → must be inherited
// final → cannot be inherited


/* 3) abstract static class ❌ NOT allowed (Top-level) */

// abstract static class Test3 { }
// ❌ Error: Top-level class cannot be static


/* But static abstract inner class ✅ allowed */

class Outer {
    static abstract class Inner {
        abstract void display();
    }
}


/* 4) final abstract method ❌ NOT allowed */

abstract class Test4 {
    // final abstract void show(); 
    // ❌ Error:
    // abstract → must override
    // final → cannot override
}


/* 5) Abstract method must be implemented in child class */

abstract class Test5 {
    abstract void display();
}

class Test6 extends Test5 {
    void display() {
        System.out.println("Display method implemented");
    }
}


/*
FINAL SUMMARY:

❌ Cannot create object of abstract class
❌ Cannot use abstract + final together
❌ Top-level class cannot be abstract static
❌ Cannot declare final abstract method
✅ Child class must implement abstract methods
*/
