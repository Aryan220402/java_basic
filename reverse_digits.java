package com.company;
import java.util.Scanner;
public class reverse_digits {
    public static void main(String[] args) {
        int num,i,rev=0;
        Scanner mc=new Scanner(System.in);
        System.out.println("Enter The Digit");
        num= mc.nextInt();
        while(num!=0)
        {
            i=num%10;
            rev=(rev*10)+i;
            num=num/10;
        }
        System.out.println(rev);
    }
}
