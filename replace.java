import java.util.Scanner;

public class replace 
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n=sc.nextInt();
        int i;
        int a[]=new int[n];
        System.out.println("Enter the Element in Array");
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter rhe element which u want to insert : ");
        int r=sc.nextInt();
        System.out.print("Enter the Specific Position : ");
        int p=sc.nextInt();
        System.out.print("After Inserting : ");
        //a[p-1]=r;
        for(i=0;i<n;i++)
        {
            if(i==p-1)
            {
                a[i]=r;
                 
            }
             System.out.print(" "+a[i]);
        }
        
          
    }
    public static void main(String args[])
    {
        replace obj=new replace();
        obj.func();
    }
}
