import java.util.Scanner;
public class reverse 
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int arry[]=new int [n];
        System.out.println("Enter the element in Array");
        for(int i=0;i<n;i++)
        {
            arry[i]=sc.nextInt();
        }
        System.out.print("Reverse of Array is : ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arry[i]+" ");
        }
    }
    public static void main(String args[])
    {
        reverse obj=new reverse();
        obj.func();
    }
}
