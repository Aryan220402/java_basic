package com.company;

import java.util.Scanner;
public class sum_of_digit {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner mc=new Scanner(System.in);
        System.out.println("Enter the number");
        num= mc.nextInt();
        while (num!=0){
        sum=sum+(num%10);
        num=num/10;}
        System.out.println("The sum of digits is "+sum);
    }}
