package p2;
import p1.*;

class D
{
	void disp()
	{
		//A a2 = new A(); here we will not be able to create obj of A as A is default not public
		d1 d = new d1();
		System.out.println(d.a);
//		System.out.println(d.b);
//		System.out.println(d.c);
//		System.out.println(d);
		
		
	}
}

class E extends d1
{
	void disp()
	{   // here even we are extending the d1 class but since E is in another package so private and default are not accessible in different package
		
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
	}
}
public class d2 {
   public static void main(String args[])
   {
	   D D1 = new D();
	   D1.disp();
   }
}
