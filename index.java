
import java.util.Scanner;

class index 
{
     void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int []arry=new int[n];
        System.out.println("Enter the element in Array");
        for(int i=0;i<n;i++)
        {
            arry[i]=sc.nextInt();
        }
        System.out.println("Enter the Specific number");
        int s=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(s==arry[i])
            {
                System.out.println("The Index of Number is "+i);
            }
           
        }
    }
    public static void main(String args[])
    {
        index obj=new index();
        obj.func();
    }
}
