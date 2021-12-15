//construtor Overloading

class RLVM
{
	RLVM()
	{
		System.out.println("Non-para....");
	}
	RLVM(int a)
	{
		System.out.println("Para...");
	}
	public static void main(String args[])
	{
		RLVM obj1=new RLVM();
		RLVM obj2=new RLVM(2);
		
	}
}