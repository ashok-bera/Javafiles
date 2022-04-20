package exception;
import java.util.*;
import java.io.*;
import java.sql.*;
class A
{              // to declare an exception used throws, and can declare multiple exceptions
	void abc() throws SQLException,NullPointerException
	{
		for(int i=0;i<=20;i++)
		{      //throw is followed by an instance and cant throw multiple exceptions
			//if(i==5) throw new NullPointerException();
			//if(i==8) throw new ArrayIndexOutOfBoundsException();
			//if(i==12) throw new SQLException();
			if(i==15) throw new ArithmeticException();
			System.out.println("I :" +i);
		}
	}
}
public class E1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        try
//        {
//        	File f = new File("abc.txt");
//        	FileReader fr = new FileReader(f);
//        }
//        catch(FileNotFoundException fnf)
//        {
//        	System.out.println("file is not available");
//        }
//	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		try
		{
			A a = new A();
			a.abc();
		}
		catch(NullPointerException np)
		{
			System.out.println("null pointer exception came");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("tu chutiya array se bhr h ");
		}
		catch(ArithmeticException ax)
		{
			System.out.println("tu zero me gus gyah ");
		}
		catch(Exception e)
		{
			System.out.println("mr ja");
		}
		
		
		finally
		{
			System.out.println("bhai ye to execute krna hi h");
		}
	}

}
