//Single Inheritence

class apple
{
	void func1()
	{
		System.out.println("Appleee.....");
	}
}
class mango extends apple
{
	void func2()
	{
		System.out.println("maanggoo.....");
	}
	
}
public class hehe
{
	public static void main(String args[])
	{
		mango obj=new mango();
		obj.func1();
		obj.func2();
	}
}
