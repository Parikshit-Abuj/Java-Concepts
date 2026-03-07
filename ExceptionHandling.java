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
