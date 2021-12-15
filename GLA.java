//constructor

class GLA
{
	GLA()
	{
		System.out.println("Welcome to GLA");
	}
	void Btech()
	{
		System.out.println("Btech prog...");
	}
	void BCA()
	{
		System.out.println("BCA prog...");
	}
	void BBA()
	{
		System.out.println("BBA prog..");
	}
	public static void main(String args[])
	{
		GLA obj=new GLA();
		
		obj.Btech();	
		obj.BCA();
		obj.BBA();
	}
}