import java.util.Scanner;
public class remove 
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the Size of array");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the element in Array");
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Specific Number : ");
        int s=sc.nextInt();
        for( i=0;i<n;i++)
        {
            if(s==a[i])
            {
                a[i]=0;
            }
        }
        for( i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        remove obj=new remove();
        obj.func();
    }
}
