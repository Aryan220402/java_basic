//Non-Parameterised Constructor Inheritence

class Amity
{
	Amity()
	{
		System.out.println("Base=Non-Para..");
	}
	Amity(int a)
	{

		System.out.println("Base=Para..");
	}
}
class gla extends Amity
{
	gla()
	{
		System.out.println("Derived=Non-Para..");
	}
	gla(int b)
	{	
		super(b);
		System.out.println("Derived=Para..");	
	}
}
public class jod
{
	public static void main(String args[])
	{
		gla obj=new gla(2);
	}
}