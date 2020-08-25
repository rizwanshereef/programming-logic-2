package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner s= new Scanner(System.in);
        int i,n;
        System.out.println("Enter the no of elements:");
        n = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the"+" "+(i+1)+" number of the 1st Array");
            arr1[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the" + " " + (i + 1) + " number of the 2nd Array");
            arr2[i] = s.nextInt();
        }
        m.sum(arr1, arr2);
    }

    public void sum(int[] arr1, int[] arr2)
    {
        int sum=0;

        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0;j< arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    sum = sum + arr1[i];
                }
            }
        }
        if(sum==0)
        {
            System.out.println("No Common Elements");
        }
        else
        {
            System.out.println("Sum of common elements of the 2 Arrays: "+sum);
        }

    }
}