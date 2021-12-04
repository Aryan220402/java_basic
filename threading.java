class threading extends Thread
{
	
	public void run()
	{
		try
		{
		
       			 for(int i=1;i<=10;i++)
			{
            			System.out.println(i);
				sleep(500);
				
				if(i==5)
				{
					stop;
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
		threading obj=new threading();
		obj.start();
	}
} 