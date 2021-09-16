package com.company;
import java.util.Scanner;
public class sample {
    public static void main(String[] args) {
    int number, quat, i=1, j;
    int []array=new int[100];
    Scanner mc=new Scanner(System.in);
    System.out.println("Enter the number ");
    number=mc.nextInt();
    quat=number;
    while (quat!=0){
        array[i++]=quat%2;
        quat=quat/2;
    }
    for (j=i-1;j>0;j--){
        System.out.print(array[j]);
    }
        System.out.println();
    }}
