//Hierarchical Inheritence

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
class Krishna extends Aryan
{
	void func3()
	{
		System.out.println("chaman");
	}
}
public class ok
{
	public static void main(String args[])	
	{
		Divyanshu obj1=new Divyanshu();
		Krishna obj2=new Krishna();
	
		obj1.func2();
		obj2.func3();	
	}
}