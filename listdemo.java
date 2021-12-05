import java.util.*;
class listdemo
{
	void func()
	{	
		List ls=new ArrayList();

		ls.add("Frooti");
		ls.add("coke");
		ls.add(10);
		ls.add(7.6);
		ls.add("Dairymilk");
		ls.add("coke");

		System.out.println(ls);
		System.out.println("Nossssss : "+ls.size());

		System.out.println("\n\n----------------------------\n\n");
			
		System.out.println(ls.get(1)); //Find
		//ls.set(1,"Pepsi");	        //Replace
		//ls.add(1,"Kitkat");	       //insert at particular index
		//ls.remove(4);		      //delete particular
		ls.clear();		     //delete All		
		
		System.out.println(ls);
		System.out.println("Nossssss : "+ls.size());
	}
	public static void main(String args[])
	{
		listdemo obj=new listdemo();
		obj.func();
	}
}