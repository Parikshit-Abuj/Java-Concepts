class Singleton {

    // Step 1: Create a static variable of the class
    private static Singleton instance;

    // Step 2: Make constructor private
    private Singleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: Create a static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1 == obj2); // true (same object)
    }
}
