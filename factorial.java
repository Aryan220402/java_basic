package com.company;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int num,fact=1,i;
        Scanner mc=new Scanner(System.in);
        System.out.println("Enter The Number");
        num= mc.nextInt();
        for (i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
