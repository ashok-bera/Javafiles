package thread;

class C extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=25;i++)
			{
				System.out.println("i"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
public class Multi {
      public static void main(String[] args)
      {
    	  C a = new C();
    	  Thread t1 = new Thread(a);
    	  Thread t2 = new Thread(a);
    	  
    	  t1.setName("team1");
    	  t2.setName("team2");
    	  
    	  System.out.println(t1);
    	  System.out.println(t2);
    	  t1.start();
    	  t2.start();
    	  try
  		  {
  			for(int i=0;i<=25;i++)
  			{   
  				if(i==8)
  				{
  					t1.suspend();
  				}
  				if(i==14)
  				{
  					t1.resume();
  				}
  				System.out.println("K:"+i);
  				Thread.sleep(1000);
  			}
  		  }
  		  catch(Exception e)
  		  {
  			
  		  }
      }
}
