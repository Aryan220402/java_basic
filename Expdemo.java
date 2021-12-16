//Exception handling

import java.util.Scanner;

class Expdemo
{
	
	void func1()
	{
		try
		{	
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the Value I : ");
			int var1=sc.nextInt();

			System.out.println("Enter the Value II: ");
			int var2=sc.nextInt();
 
			int res=var1/var2;
		
			System.out.println("Division : "+res);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void func2()
	{
		System.out.println("fn2 is working");
	}
	public static void main(String args[])
	{
		Expdemo obj=new Expdemo();
		obj.func1();
		obj.func2();
	}
} 