package com.company;
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
       int n1, n2;
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        n1= sc.nextInt();
        System.out.println("Enter the second number");
        n2=sc.nextInt();
        System.out.println("The sum of first and second number is "+(n1+n2));
    }
}
