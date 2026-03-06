//number and show() are private
//They can be used only inside PrivateExample class

class PrivateExample {

    private int number = 10;   // private variable

    private void show() {      // private method
        System.out.println("Number is: " + number);
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.show();  // allowed because it is inside the same class
    }
}

/*No modifier is written
So it becomes default
Accessible within the same package*/

class ProtectedExample {

    protected int number = 30;

    protected void show() {
        System.out.println("Number is: " + number);
    }
}

class TestProtected extends ProtectedExample {

    public static void main(String[] args) {
        TestProtected obj = new TestProtected();
        obj.show();  // accessible because of inheritance
    }
}

//public members can be used from any class and package

public class PublicExample {

    public int number = 40;

    public void display() {
        System.out.println("Number is: " + number);
    }

    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.display();
    }
}
