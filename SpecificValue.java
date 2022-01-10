import java.util.Scanner;
public class SpecificValue 
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        int temp=0;
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
                temp=1;
                break;
              
            }
        }
        if(temp==1)
        {
            System.out.println("True :"+s);
        }
        else
            {
                System.out.println("Not Found");
            }
    }
    public static void main(String args[])
    {
        SpecificValue obj=new SpecificValue();
        obj.func();
    }
}
