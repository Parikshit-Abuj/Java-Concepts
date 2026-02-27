// Interface = contract (all methods are public & abstract by default)
interface Test {
    void meth1();
    void meth2();
}
// Class must implement all interface methods
class My implements Test {
    @Override  // Ensures correct overriding
    public void meth1() {
        System.out.println("called meth1 of My");
    }
    @Override
    public void meth2() {
        System.out.println("called meth2 of My");
    }
    public void meth3() {
        System.out.println("called meth3 of My");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        // Interface reference → only interface methods accessible
        Test t = new My();
        t.meth1();
        t.meth2();

        // Class reference → all public methods accessible
        My m = new My();
        m.meth3();
		m.meth2();
		m.meth1();
    }
}

//EXAMPLE SMARTPHONE
class Phone {
    public void call() {
        System.out.println("Phone call");
    }
    public void sms() {
        System.out.println("Phone sending SMS");
    }
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {

    public void click() {
        System.out.println("Smart Phone clicking photo");
    }
    public void record() {
        System.out.println("Smart Phone recording video");
    }
    public void play() {
        System.out.println("Smart Phone playing music");
    }
    public void stop() {
        System.out.println("Smart Phone stopped playing music");
    }
    public void videoCall() {
        System.out.println("Smart Phone video calling");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        // SmartPhone reference
        SmartPhone sp1 = new SmartPhone();
        sp1.call();
        sp1.sms();
        sp1.click();
        sp1.record();
        sp1.play();
        sp1.stop();
        sp1.videoCall();

        System.out.println("-----");

        // Phone reference
        Phone sp2 = new SmartPhone();
        sp2.call();
        sp2.sms();

        System.out.println("-----");

        // Camera reference
        ICamera sp3 = new SmartPhone();
        sp3.click();
        sp3.record();

        System.out.println("-----");

        // MusicPlayer reference
        IMusicPlayer sp4 = new SmartPhone();
        sp4.play();
        sp4.stop();
    }
}

//EXAMPLE2 CALLBACK INTERFACE
interface Member {
    void callback();
}

class Store {

    private Member[] members = new Member[10];
    private int count = 0;

    void register(Member m) {
        members[count++] = m;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            members[i].callback();   // polymorphic call
        }
    }
}

class Customer implements Member {

    private String name;

    Customer(String n) {
        name = n;
    }

    public void callback() {
        System.out.println(name + " will visit the store for the sale.");
    }
}

public class SCInterface1 {

    public static void main(String[] args) {

        Store s = new Store();

        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
}
