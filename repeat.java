import java.util.Scanner;
public class repeat
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arry[]=new int[n];
        System.out.println("Enter the element in Array");
        for( i=0;i<n;i++)
        {
            arry[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
        for( j=1;j<n;j++)
        {
            if((arry[j]==arry[i])&& (i!=j))
            {
                System.out.println("Repeated Element : "+arry[j]);
            }
        }
        }
    }
    public static void main(String args[])
    {
        repeat obj=new repeat();
        obj.func();
    }
}
