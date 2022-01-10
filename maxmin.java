import java.util.Scanner;
public class maxmin 
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int i;
        int arry[]=new int[n];
        System.out.println("Enter the Element in Array");
        for( i=0;i<n;i++)
        {
            arry[i]=sc.nextInt();
        }
        int max=arry[0];
        int min=arry[0];
        for( i=0;i<n;i++)
        {
            if(arry[i]>max)
            {
                max=arry[i];
                
            }
        }
        System.out.println("Maximum Number is : "+max);
          for( i=0;i<n;i++)
        {
            if(arry[i]<min)
            {
                min=arry[i];
                
            }
        }
        System.out.println("Minimum Number is : "+min);
    }
    public static void main(String arrgs[])
    {
        maxmin obj=new maxmin();
        obj.func();
    }
}

