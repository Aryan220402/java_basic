import java.util.*;

class stackdemo
{
	void func()
	{	
		Stack st=new Stack();
		
		st.push("Coke");
		st.push("Pepsi");
		st.push(10);
		st.push(4.5);
		st.push("Frooti");

		System.out.println(st);
		System.out.println("Nossss : "+st.size());

		System.out.println("\n\n--------------------------\n\n");

		//System.out.println("Deleted : "+st.pop());
		System.out.println("Last element : "+st.peek());

		System.out.println(st);
		System.out.println("Nossss : "+st.size());
	}
	public static void main(String args[])
	{
		stackdemo obj=new stackdemo();
		obj.func();
	}
}