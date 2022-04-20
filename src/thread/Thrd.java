package thread;
class A extends Thread
{
	public void run()
	{   try 
	   {
		for(int i=0;i<10;i++)
		{
			System.out.println("I: "+i);
			Thread.sleep(1000);
		}
	  }
	catch(Exception e)
	{
		
	}
	}
}
//class B extends Thread
//{
//	public void run()
//	{   try
//	    {
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("J: "+i);
//			Thread.sleep(1000);
//		}
//	    }
//	    catch(Exception e)
//	  {
//	    	
//	  }
//	}
//}
public class Thrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a = new A();
        //B b = new B();
        a.start();
        //b.start();
	}

}
