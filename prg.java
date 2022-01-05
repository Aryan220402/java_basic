import java.util.Scanner;
class prg
{
    void func()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String");
            String str=sc.nextLine();
            for(int i=0;i<str.length();i++)
	    {
                char c=str.charAt(i);
                if((c=='a') || (c=='e') ||(c=='i') ||(c=='o') ||(c=='u') ||(c=='A') ||(c=='E') ||(c=='I') ||(c=='O') ||(c=='U' ))
		{
                    System.out.print("");
                }
                else
	        {
                    System.out.print(str.charAt(i));
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        prg obj=new prg();
        obj.func();
    }
}