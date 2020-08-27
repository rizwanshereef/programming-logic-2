package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class CountArray {
/*main class to check the count of 9s in the array*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int len = scan.nextInt();
    /*Array insert*/
        int num[] = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter the " + (i + 1) + "Number:");
            num[i] = scan.nextInt();
        }
/*passing the array to method arrayCount*/
        arrayCount(num);

    }

/*Method to count the no of 9 on the array*/
    public static void arrayCount(int[] num){
/*Initialize count variable*/
        int count = 0;
        int len = num.length;
/*Checking each value of array for 9 then increment counter*/
        for(int i =0; i<len;i++){
            if(num[i]==9)
            {
                count++;
            }
        }

        System.out.println("The entered array is "+ Arrays.toString(num));
        System.out.println("The number of 9s in the array is: "+count);
    }
}
