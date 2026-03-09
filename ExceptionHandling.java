//TRY CATCH BLOCK
import java.util.Scanner;
public class ExceptionDemo{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("enter two numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator must not be zero");
		}
		System.out.println("Bye");
	}
}

//MULTIPLE CATCH BLOCK FOR TRY BLOCK
public class Main{
	public static void main(String args[]){
		int A[]={30,20,10,40,0};
		try
		{
			int c=A[0]/A[2];
			System.out.println("Division is " +c);
			System.out.println(A[3]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is invalid");
		}
			System.out.println("Bye");
	}
}
		
//NESTED TRY CATCH
public class Main{
	public static void main(String args[]){
		int A[]={30,20,10,40,0};
		try
		{
			int c=A[0]/A[2];
			System.out.println("Division is " +c);
			try
			{
			System.out.println(A[5]);
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is invalid");
		}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be zero");
		}
		    System.out.println("Bye");
	}
}

//UNCHECKED EXCEPTION
public class Unchecked{
static void fun1()
{
    try
    {
        System.out.println(10/0);
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
}
}

//CHECKED EXCEPTION
import java.io.*;

class Test
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("test.txt");
            System.out.println("File opened");
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
    }
}

//PROPAGATION OF EXCEPTION
class Test
{
    static void fun1()
    {
        System.out.println(10/0);   // ArithmeticException
    }

    static void fun2()
    {
        fun1();   // exception comes here
    }

    static void fun3()
    {
        try
        {
            fun2();   // exception propagates here
        }
        catch(Exception e)
        {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args)
    {
        fun3();
    }
}

//THROW
class Test
{
    public static void main(String[] args)
    {
        int age = 15;

        if(age < 18)
        {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("You can vote");
    }
}

//THROWS
class Test
{
    static void divide() throws ArithmeticException
    {
        int a = 10, b = 0;
        int c = a / b;   // exception occurs
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        try
        {
            divide();
        }
        catch(Exception e)
        {
            System.out.println("Exception handled");
        }
    }
}

//finally
class Test
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10 / 0;   // causes exception
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
        finally
        {
            System.out.println("Finally block executed");
        }
    }
}

//TRY WITH RESOURCE 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
