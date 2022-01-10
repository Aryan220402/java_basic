import java.util.Scanner;
public class prime 
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int temp=0;
        int n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
               temp=1;
            }
        }
        if(temp==1)
        {
            System.out.println("Not Prime "+n);
        }
        else
        {
            System.out.println("Prime : "+n);
        }
    }
    public static void main(String args[])
    {
        prime obj=new prime();
        obj.func();
    }
}
