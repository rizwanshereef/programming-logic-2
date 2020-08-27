package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;
/*Main class to sort the array in mix of largest and smallest*/
public class ArraySort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int len= scan.nextInt();
        int arr[]= new int[len];
        for(int i=0;i<len;i++)
        {
            System.out.println("Enter the "+(i+1)+" number");
            arr[i] = scan.nextInt();
        }
/*Sort the array*/
        Arrays.sort(arr);
        System.out.println("Original Array");
        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
/*Rearrange the array and display*/
        rearrange(arr, len);
        System.out.print("\nModified Array\n");
        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
    }
/*Method to rearrange the array*/
    public static void rearrange(int arr[], int len)
    {
        int max_indx = len - 1, min_indx = 0;
        int max_elem = arr[len - 1] + 1;
        for (int i = 0; i < len; i++)
        {
            if (i % 2 == 0)
            {
                arr[i] = arr[i] + (arr[max_indx] % max_elem) * max_elem;
                max_indx--;
            }
            else
            {
                arr[i] = arr[i] + (arr[min_indx] % max_elem) * max_elem;
                min_indx++;
            }
        }
        for (int i = 0; i < len; i++)
            arr[i] = arr[i] / max_elem;
    }

    }



