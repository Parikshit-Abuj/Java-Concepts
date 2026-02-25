//Inheritance
class Animal{
String name;
int age;

void eat() {
System.out.println("Animal is eaating");
} }

class Dog extends Animal{
String breed;

void bark(){
System.out.println("Dog is barking");
}}

public class Main{
public static void main(String args[]){
Dog dog = new Dog();
dog.name = "moti";
dog.age=5;
dog.breed="german";
dog.eat(); //prints animal is eating
dog.bark();//prints dog is barking 
}}

// inheritance
class Circle {
    int radius;

    double area() {
        return Math.PI * radius * radius;
    }
}

// Child Class
class Cylinder extends Circle {
    int height;

    double volume() {
        return area() * height;
    }
}

// Main Class
public class Main {
    public static void main(String args[]) {

        Cylinder c1 = new Cylinder();
        c1.radius = 7;
        c1.height = 10;

        System.out.println("Area: " + c1.area());
        System.out.println("Volume: " + c1.volume());
    }
}

//Calling paremeterized constructors
// Parent class
class Parent {

    Parent() {
        System.out.println("Called unparameterized Parent constructor");
    }

    Parent(int x) {
        System.out.println("Called parameterized Parent constructor: " + x);
    }
}

// Child class
class Child extends Parent {

    Child() {
        System.out.println("Called unparameterized Child constructor");
    }

    Child(int x) {
        System.out.println("Called parameterized Child constructor: " + x);
    }

    Child(int x, int y) {
        super(x);   // Calls Parent(int x)
        System.out.println("Called parameterized and Child(y): " + y);
    }
}

// Main class
public class Main {
    public static void main(String args[]) {
        Child c = new Child(10, 20);
    }
}

//THIS KEYWORD
class Rectangle {

    int length;
    int breadth;

    // Parameterized constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String args[]) {

        Rectangle r = new Rectangle(10, 20);

        System.out.println("Area = " + r.area());
    }
}

//SUPER KEYWORD
//CALL PARENT CLASS VARIABLE
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
//CALL PARENT METHOD
class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child display");
    }

    void show() {
        super.display();   // Calls Parent method
        display();         // Calls Child method
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
//CALL PARENT CONSRUCTOR
class Parent {
    Parent(int x) {
        System.out.println("Parent constructor: " + x);
    }
}

class Child extends Parent {
    Child(int x) {
        super(x);  // Must be first line
        System.out.println("Child constructor: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child(5);
    }
}
