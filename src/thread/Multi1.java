package thread;

class Mul extends Thread
{   //what synchronized keyword does is it does not allow the different threads of a process run parallel i.e. at a time they cant run simultaneously
	public  void run()
	{   try
	   {
		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
			Thread.sleep(1000);
		}
	   }
	   catch(Exception e)
		{
		   
		}
	}
}
public class Multi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mul m = new Mul();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		
		t1.start();
		t2.start();
		
		t1.setName("ash");
		t2.setName("anj");
		
		try
		{
			for(int k=0;k<=30;k++)
			{   
				if(k==8)
				{
					t1.suspend();
				}
				if(k==10)
				{
					t2.suspend();
					t1.resume();
				}
				if(k==15)
				{
					t2.resume();
					System.out.println(t1.isAlive());
				}
				if(k==20)
				{
					t1.stop();
					System.out.println(t1.isAlive());
				}
				System.out.println("  k: "+ k);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			
		}

	}

}
