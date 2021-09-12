package com.company;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner mc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a");
        a=mc.nextInt();
        System.out.println("Enter the value of b");
        b=mc.nextInt();
        System.out.println("The Value enter by the user of first variable is "+a+" and second variable"+b );
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After the swapping the value first value is "+a+" And the second value "+b);


    }
}
