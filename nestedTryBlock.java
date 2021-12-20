class time
{
     void func()
	{
        try 
	{
            int a=7, b=2;
            int []arr={1,2 };
            try
		{
			if(b==1)
			{
                    		a=a/0;
                	}
                	if(b==2)
			{
                 	   	arr[23]=78;
              	        }
            	}
            catch(ArrayIndexOutOfBoundsException e)
	    {
            	System.out.println(e);
            }
        }
	catch (ArithmeticException ae)
	{
            System.out.println(ae);
        }
    	}
}
public class nestedTryBlock 
{
    public static void main(String[] args) 
	{
        	time t=new time();
        	t.func();
    }
}