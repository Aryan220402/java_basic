
import java.util.Scanner;


public class Average 
{
      void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n=sc.nextInt();
        int sum=0;
        int [] arry=new int[n];
        System.out.println("Enter the Element in Array");
        for(int i=0;i<n;i++)
        {
            arry[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+arry[i];
        }
        System.out.println("Sum of Array is : "+sum/n);
    }
    public static void main(String args[])
    {
        Average obj=new Average();
        obj.func();
    }
}
