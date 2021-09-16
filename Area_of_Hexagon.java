package com.company;
import java.util.Scanner;

import static java.lang.Math.tan;

public class Area_of_Hexagon {
    public static void main(String[] args) {
        int l;
        double a;
        Scanner mc=new Scanner(System.in);
        System.out.println("Enter the length");
        l= mc.nextInt();
        a=(6*Math.pow(l,2))/(4*tan(Math.PI/6));
        System.out.println("Area of Hexagon is "+a);
    }
}
