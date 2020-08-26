package com.stackroute;

public class Main {

/* Main class to print sequence of * */
    public static void main(String args[]){
        Main m = new Main();
        int n = 5;
/*Invoke method stars*/
        Stars(n);
    }

/*Method to print * sequence */
    public static void Stars(int n){
        int i, j;
/*Print * using 3 loops based on number of each value of n*/
        for(i=0; i<n; i++){
            for(j=2*(n-i); j>=0; j--){
                System.out.print(" ");
            }

            for(j=0; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
