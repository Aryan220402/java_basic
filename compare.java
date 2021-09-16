package com.company;
import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        int number1,number2;
        Scanner mc=new Scanner(System.in);
        System.out.println("Enter the value of n1");
        number1= mc.nextInt();
        System.out.println("Enter the value of n2");
        number2= mc.nextInt();
        if ( number1 == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
        if ( number1 < number2 )
            System.out.printf( "%d < %d\n", number1, number2 );
        if ( number1 > number2 )
            System.out.printf( "%d > %d\n", number1, number2 );
        if ( number1 <= number2 )
            System.out.printf( "%d <= %d\n", number1, number2 );
        if ( number1 >= number2 )
            System.out.printf( "%d >= %d\n", number1, number2 );
    }
}
