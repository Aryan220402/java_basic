//Multi-level Inheritence

class Aryan
{
	void func1()
	{
		System.out.println("Gamer");
	}
}
class Divyanshu extends Aryan
{
	void func2()
	{
		System.out.println("Coder");
	}
}
class Krishna extends Divyanshu
{
	void  func3()
	{
		System.out.println("Chaman");
	}
	
}
public class lol
{
	public static void main(String args[])
	{
		Krishna obj=new Krishna();
		
		obj.func1();
		obj.func2();
		obj.func3();
	}
}
