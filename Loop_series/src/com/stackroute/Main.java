package com.stackroute;

import java.util.Scanner;
/*Class to print sequence of * */
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*Enter the length of the tree level*/
        System.out.println("Enter the value of n: ");
        int number = sc.nextInt();
/* * generation using 2 loops */
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
        }
    }
}