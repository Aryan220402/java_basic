import java.util.Scanner;

class Exp
{
	void func1()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Value");
			String var=sc.next();
			System.out.print("String value : ");
			System.out.println(var);

			System.out.println("\n------------------------------------\n");

			int z=Integer.parseInt(var);
			System.out.print("Numeric Value");
			System.out.println(" Try block......."+z);				
		}
		catch(Exception e)
		{
			System.out.println("Catch block..."+e);
		}
		finally
		{
			System.out.println("No impact in finally block...");
		}
	}
	void func2()
	{
		System.out.println("fn2 is working");
	}	
	public static void main(String args[])
	{
		Exp obj=new Exp();
		obj.func1();
		obj.func2();
	}
}