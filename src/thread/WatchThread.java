package thread;
public class WatchThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {   int minute =0;
            int hr=0;
            int sec=0;
        	for(int s=0;s<=10;s++)
        	{   sec++;
        		if(sec==60)
        		{
        			minute++;
        			sec=0;
        			
        		}
        		if(minute==60)
        		{
        			hr++;
        			minute =0;
        		}
        		
        		System.out.println(hr +":" + minute + ":"+ sec);
        		Thread.sleep(1000);
        	}
        }
        catch(Exception e)
        {
        	
        }
	}

}
