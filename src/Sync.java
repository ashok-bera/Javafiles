
class table
{
	synchronized void mul(int n)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i*n);
			try{  
			      Thread.sleep(1000);  
			     }catch(Exception e){System.out.println(e);}  
		}
		
	}
}
class thread1 extends Thread
{
	table t;
	thread1(table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.mul(5);
	}
}
class thread2 extends Thread
{
	table t;
	thread2(table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.mul(100);
	}
}
public class Sync {
  public static void main(String args[])
  {   
	  table obj = new table();
	  thread1 t1 = new thread1(obj);
	  thread2 t2 = new thread2(obj);
	  t1.start();
	  t2.start();
  }
}
