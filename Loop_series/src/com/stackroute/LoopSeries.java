package com.stackroute;

import java.util.Scanner;
/*Class to print sequence of number */
public class LoopSeries {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
/*Enter the number series to be generated*/
        System.out.println("Enter the value of n: ");
        int number = scan.nextInt();
/* generate values using 2 loops which prints value as of the number count */
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
        }
    }
}