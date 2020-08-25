package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n= s.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" number");
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Original Array");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        rearrange(arr, n);
        System.out.print("\nModified Array\n");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void rearrange(int arr[], int n)
    {
        int max_indx = n - 1, min_indx = 0;
        int max_elem = arr[n - 1] + 1;
        for (int i = 0; i < n; i++)
        {
            if (i % 2 == 0)
            {
                arr[i] += (arr[max_indx] % max_elem) * max_elem;
                max_indx--;
            }
            else
            {
                arr[i] += (arr[min_indx] % max_elem) * max_elem;
                min_indx++;
            }
        }
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;
    }

    }



