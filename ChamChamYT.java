class ABC
{
	void func()
	{
	System.out.println("Fn is working");
	}
}
class ChamChamYT extends ABC implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=15;i++)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		ChamChamYT obj=new ChamChamYT();
		Thread th=new Thread(obj);
		th.start();	
		
		obj.func();	
	}
}