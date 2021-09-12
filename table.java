package com.company;
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=10;i>0;i--){
            System.out.println(n+" X "+i+" = "+i*n);
        }
    }
}
