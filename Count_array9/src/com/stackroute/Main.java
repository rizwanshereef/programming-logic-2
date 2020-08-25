package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = s.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + "Number:");
            num[i] = s.nextInt();
        }
        arrayCount(num);


    }

    public static void arrayCount(int[] num)
    {
        int count = 0;
        int n = num.length;

        for(int i =0; i<n;i++)
        {
            if(num[i]==9)
            {
                count++;
            }
        }

        System.out.println("The entered array is "+ Arrays.toString(num));
        System.out.println("The number of 9s in the array is: "+count);
    }
}
