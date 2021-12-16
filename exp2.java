import java.util.Scanner;	
class exp2
{
	void func1()
	{
		try
		{
			int arr[]=new int[5];
			int i;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the element in array");
			for(i=0;i<5;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.print("Elements in Array : ");
			for(i=0;i<5;i++)
			{	
				
				System.out.print(" "+arr[i]/0);
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array"+ae);
		}
		catch(ArithmeticException aaee)
		{
			System.out.println("Division"+aaee);
		}
	}
	public static void main(String args[])
	{
		exp2 obj=new exp2();
		obj.func1();
	}
}