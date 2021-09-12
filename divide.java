package com.company;
import java.util.Scanner;
public class divide {
    public static void main(String[] args) {
        int a,b;
        Scanner mc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        a= mc.nextInt();
        System.out.println("Enter the value of b");
        b= mc.nextInt();
        System.out.println("divide="+(a /b));
    }
}
