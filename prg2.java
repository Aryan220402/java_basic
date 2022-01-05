import java.util.Scanner;

public class prg2 
{
    void func()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String");
            String str=sc.nextLine();
            str = str.replaceAll("[aeiouAEIOU]", "");
             System.out.println(str);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        prg2 obj=new prg2();
        obj.func();
    }
}
