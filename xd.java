//Function Overloading

class Java
{
	void func1()
	{
		System.out.println("Gamer");
	}
	final void func2()
	{
		System.out.println("Coder");
	}
}
class DBMS extends Java
{
	void func2()
	{
		System.out.println("Memer");	
	}
	void func3()
	{
		System.out.println("Joker");
	}
}
public class xd
{
	public static void main(String args[])
	{
		DBMS obj=new DBMS();

		obj.func1();
		obj.func2();
		obj.func3();
	}
}