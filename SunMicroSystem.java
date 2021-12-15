//Staic function in interface

interface Oracle
{
	abstract void func1();

	static void func2()
	{
		System.out.println("Static fn is working");	
	}
}
class SunMicroSystem implements Oracle
{
	public void func1()
	{
		System.out.println("fn1 is working...");
	}
	 void func3()
	{
		System.out.println("fn2 is working...");
	}
	public static void main(String args[])
	{
		SunMicroSystem obj=new SunMicroSystem();
		obj.func1();
		obj.func3();
			
		Oracle.func2();
	}
}

		
	
