import java.util.Scanner;

class AgeException extends Exception
{
	AgeException()
	{
		
	}
}
class user
{
	Scanner sc=new Scanner(System.in);
	void func1()
	{
		try
		{
			System.out.print("Enter the age: ");
			int age=sc.nextInt();
			if(age>=18)
			{
				System.out.println("vote done");
			}
			else
			{
				throw new AgeException();	
			}
		}
		catch(AgeException ae)
		{
			System.out.println("Under Age "+ae);
		} 
		finally
		{
			System.out.println("Next voter coming");	
		}
	}
	
	public static void main(String args[])
	{
		user obj=new user();
		obj.func1();
	}
}