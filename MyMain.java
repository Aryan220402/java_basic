class thrad1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Fn1.....");
				sleep(500);
			}
			System.out.println("Thread Completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class thrad2 implements Runnable
{
	public void run()
	{
		try
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println(".....Fn2");
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class MyMain 
{
	public static void main(String args[])
	{
		thrad1 obj1=new thrad1();
		obj1.setPriority(1);
		obj1.start();
		
		
		thrad2 obj2=new thrad2();
		
		Thread th1=new Thread(obj2);
		th1.setPriority(1);
		th1.start();
		
	}
}