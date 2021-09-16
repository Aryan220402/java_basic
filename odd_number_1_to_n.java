package com.company;
import java.util.Scanner;
public class odd_number_1_to_n {
    public static void main(String[] args) {
        int n,i;
        Scanner mc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n= mc.nextInt();
        for (i=1;i<=n;i++)
        {
         if (i%2!=0)
             System.out.print(" "+i);
        }
    }
}
