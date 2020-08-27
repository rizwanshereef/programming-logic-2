package com.stackroute;

import java.util.Scanner;

public class SumOfCommonArray {
/*Main class to find the sum of common elements*/

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int i,len;
        System.out.println("Enter the no of elements:");
        len = scan.nextInt();
        int arr1[] = new int[len];
        int arr2[] = new int[len];

/*Input values into 2 arrays*/
        for(i=0;i<len;i++){
            System.out.println("Enter the"+" "+(i+1)+" number of the 1st Array");
            arr1[i]=scan.nextInt();
        }
        for(i=0;i<len;i++){
            System.out.println("Enter the" + " " + (i + 1) + " number of the 2nd Array");
            arr2[i] = scan.nextInt();
        }

/*Call method to find common sum*/
        sum(arr1, arr2);
    }

/*Method to find sum of common number in array*/
public static void sum(int[] arrOne, int[] arrTwo){
        int sum=0;
/*Check both arrays for common element and increment sum counter*/
        for(int i=0; i<arrOne.length; i++){
            for(int j=0;j< arrTwo.length;j++){
                if(arrOne[i]==arrTwo[j])
                {
                    sum = sum + arrOne[i];
                }
            }
        }
        if(sum==0){
            System.out.println("No Common Elements");
        }
        else{
            System.out.println("Sum of common elements of the 2 Arrays: "+sum);
        }

    }
}