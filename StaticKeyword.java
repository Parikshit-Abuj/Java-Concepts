class StaticKeyword
{
    static int x = 10;
    int y = 20;
    
    void show()
    {
        System.out.println(x + " " + y);
    }
    
    static void display()
    {
        System.out.println(x);  
        // A static method cannot access non-static variable y
    }
}

public class StaticPractice
{
    public static void main(String args[])
    {
        StaticKeyword t1 = new StaticKeyword();
        t1.show();
        
        t1.x = 30;   // modifies static variable (shared)
        t1.y = 50;   // modifies instance variable (only for t1)
        
        StaticKeyword t2 = new StaticKeyword();
        t2.show();
    }
}

//STATIC BLOCK
public class StaticPractice
{
	static
	{
		System.out.println("Block 1");
	}
	public static void main(String args[])
	{
		System.out.println("Main");
	}
	static
	{
		System.out.println("Block 2");
	}
}
//OUTPUT: 
//Block 1
//Block 2
//Main

class Test
{
    static 
    {
        System.out.println("block 1");
    }

    static
    {
        System.out.println("block 2");
    }
}

public class StaticPractice
{
    public static void main(String args[])
    {
        Test t = new Test();
        System.out.println("Main");
    }
}
//OUTPUT
//block1
//block2
//Main
