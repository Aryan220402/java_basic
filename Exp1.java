import java.util.Scanner;

class Exp1
{
	void func1()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Value");
			String var=sc.next();
			System.out.print("String value : ");
			System.out.println(var+5);

			System.out.println("\n------------------------------------\n");

			int z=Integer.parseInt(var);
			System.out.print("Numeric Value : ");
			System.out.println(z+5);				
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
		Exp1 obj=new Exp1();
		obj.func1();
		obj.func2();
	}
}