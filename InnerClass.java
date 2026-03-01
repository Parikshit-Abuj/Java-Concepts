// INNER CLASS

class Outer {
    int x = 10;
    Inner i = new Inner();   // Accessible in entire class

    class Inner {
        int y = 20;

        public void innerDisplay() {
            System.out.println(x + " " + y);  
            // Inner class can directly access outer class members
        }
    }

    public void outerDisplay() {
        // Outer class needs an object of Inner to access it
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();

        // If you want to call outerDisplay()
        Outer o = new Outer();
        o.outerDisplay();
    }
}

//LOCAL INNERCLASS

class Outer
{
	public void display()
	{
		class Inner                         //LOCAL INNERCLASS INSIDE OUTERCLASS METHOD
		{
			public void show()
			{
				System.out.println("Hello");
			}
		}
		Inner i = new Inner();
		i.show();
        //new Inner().show();                  //WE CAN DIRECTLY CALL WITHOUT CREATING OBJECT		
	}
}
public class LocalInner
{
	public static void main(String args[])
	{
		Outer o = new Outer();
		o.display();
	}
}

// ANONYMOUS INNER CLASS
abstract class My
{
    abstract public void show();
}

class Outer
{
    public void display()
    {
        My m = new My()
        {
            public void show()
            {
                System.out.println("Hello");
            }
        };   

        m.show();  
    }
}

public class Main
{
    public static void main(String args[])
    {
        Outer o = new Outer();
        o.display();
    }
}

// ANONYMOUS INTERFACE
interface My
{
    public void show();
}

class Outer
{
    public void display()
    {
        My m = new My()
        {
            public void show()
            {
                System.out.println("Hello");
            }
        };   // Semicolon is mandatory

        m.show();   // Calling the method
    }
}

public class Main
{
    public static void main(String args[])
    {
        Outer o = new Outer();
        o.display();
    }
}

// STATIC INNER CLASS
class Outer
{
    int x = 10;
    static int y = 20;

    static class My
    {
        public void show()
        {
            System.out.println(y);   // Can access only static members of Outer
        }
    }
}

public class Main
{
    public static void main(String args[])
    {
        Outer.My m = new Outer.My(); 
        m.show();
    }
}
