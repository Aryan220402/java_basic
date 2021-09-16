package com.company;
import java.util.Scanner;
public class product_of_digits {
    public static void main(String[] args) {
        int num,pro=1;
        Scanner mc=new Scanner(System.in);
        System.out.println("Enter the number");
        num= mc.nextInt();
        while (num!=0){
            pro=pro*(num%10);
            num=num/10;}
        System.out.println("The sum of digits is "+pro);
    }
}
