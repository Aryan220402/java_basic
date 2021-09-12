package com.company;
import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        int num;
        Scanner mc=new Scanner(System.in);
        num= mc.nextInt();
        System.out.println("Enter the number");
        if (num%2==0) {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }

    }
}
