package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
/*main class to check the count of 9s in the array*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = s.nextInt();
    /*Array insert*/
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + "Number:");
            num[i] = s.nextInt();
        }
/*passing the array to method arrayCount*/
        arrayCount(num);


    }

/*Method to count the no of 9 on the array*/
    public static void arrayCount(int[] num){
/*Initialize count variable*/
        int count = 0;
        int n = num.length;
/*Checking each value of array for 9 then increament counter*/
        for(int i =0; i<n;i++){
            if(num[i]==9)
            {
                count++;
            }
        }

        System.out.println("The entered array is "+ Arrays.toString(num));
        System.out.println("The number of 9s in the array is: "+count);
    }
}
