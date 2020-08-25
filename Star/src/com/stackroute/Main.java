package com.stackroute;

public class Main {

    public static void main(String args[])
    {
        Main m = new Main();
        int n = 5;
        Stars(n);
    }

    public static void Stars(int n)
    {
        int i, j;
        for(i=0; i<n; i++)
        {
            for(j=2*(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }

            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
