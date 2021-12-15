//function overloading

class Area
{
	void squ(int s)
	{
		System.out.println("Enter the side of square : "+(s*s));
	}
	void rec(int l, int b)
	{
		System.out.println("Enter the length and breath of rectangle : "+(l*b));
	}
}
public class total
{
	public static void main(String args[])
	{
		Area obj=new Area();

		obj.squ(5);
		obj.rec(4,5);
	}
}