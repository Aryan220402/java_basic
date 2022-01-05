import java.util.Scanner;

class prg1
{
	void func()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter the Size of Array");
			int n=sc.nextInt();
			int arry[]=new int[n];
                        System.out.println("Enter the Elements in Array");
			for(int i=0;i<n;i++)
			{
				arry[i]=sc.nextInt();
			}
                        System.out.println("\n------------------------------\n");
                        System.out.print("Numbers which are multiple of 3 or 5 is : ");
                        for(int i=0;i<n;i++)
                        {
                            if(arry[i]%3==0 || arry[i]%5==0)
                            {
                                if(arry[i]%3==arry[i]%5)
                                {
                                }
                                else
                                {
                                    System.out.print(arry[i]+ " ");
                                }
                             
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
		prg1 obj=new prg1();
		obj.func();	
	}
}
