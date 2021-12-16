class thrd1 implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=15;i++)
			{
				System.out.println("Fn1......");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class thrd2 implements Runnable
{
	public void run()
	{
		try
		{
			for(int j=30;j<=60;j++)
			{
				System.out.println("......fn2");
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String args[])
	{
		 thrd1 obj1=new thrd1();
		 thrd2 obj2=new thrd2();
		
		Thread th1=new Thread(obj1);
		Thread th2=new Thread(obj2);
		
		th1.start();
		th2.start();
	}
}