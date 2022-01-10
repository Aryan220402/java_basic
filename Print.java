import java.util.Scanner;
public class Print 
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n=sc.nextInt();
        int [][]arry=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
    public static void main(String args[])
    {
        Print obj=new Print();
        obj.func();
    }
}
