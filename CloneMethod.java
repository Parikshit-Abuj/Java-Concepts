class MyClass implements Cloneable {
    int myField;

    MyClass(int myField) {
        this.myField = myField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        MyClass myClass = new MyClass(10);
        MyClass clonedMyClass = (MyClass) myClass.clone();

        System.out.println(myClass.myField);       // 10
        System.out.println(clonedMyClass.myField); // 10
    }
}
