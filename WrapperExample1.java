//Autoboxing example of int to Integer 

import java.util.Scanner;

class WrapperExample1
{  
	void func()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			//Converting int into Integer  
			System.out.println("Enter the value");
			int a=sc.nextInt();  
			Integer i=Integer.valueOf(a);	//converting int into Integer explicitly  
			Integer j=a;        		 //autoboxing, now compiler will write Integer.valueOf(a) internally  
  
			System.out.println(a.getClass().getSimpleName());  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public static void main(String args[])
	{  
		WrapperExample1 obj=new WrapperExample1();
		obj.func();
	}
}  