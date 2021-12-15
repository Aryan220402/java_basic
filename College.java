abstract class AKTUniversity
{
	void func1()
	{
		System.out.println("Btech prog...");
	}
	abstract void func2(); // declaration
}
class College extends AKTUniversity
{	
	//override
	void func2() //definition
	{
		System.out.println("BBA prog..");
	}
	void func3()
	{
		System.out.println("BCA prog..");
	}
	public static void main(String args[])
	{
		College obj=new College();
		obj.func1();
		obj.func2();
		obj.func3();
	}
}