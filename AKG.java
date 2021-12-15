//multiple inheritence in java using interface 

interface Oracle
{
	public void func1();
}
interface SunMicroSystem
{
	abstract void func2();
}
class AKG implements Oracle,SunMicroSystem
{
	public void func1()
	{
		System.out.println("fn1 is working...");
	}
	public void func2()
	{
		System.out.println("fn2 is working...");
	}
	public void func3()
	{
		System.out.println("fn3 is working...");
	}
	void func4()
	{
		System.out.println("fn4 is working...");
	}
	public static void main(String args[])
	{
		AKG obj=new AKG();

		obj.func1();
		obj.func2();
		obj.func3();	
		obj.func4();
	}
}