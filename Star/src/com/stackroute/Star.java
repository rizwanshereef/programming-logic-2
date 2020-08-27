package com.stackroute;

public class Star {

/* Main class to print sequence of * */
    public static void main(String args[]){
        int len = 5;
/*Invoke method stars*/
        Stars(len);
    }

/*Method to print * sequence */
    public static void Stars(int len){
        int i, j;
/*Print * using 3 loops based on number of each value of len*/
        for(i=0; i<len; i++){
            for(j=2*(len-i); j>=0; j--){
                System.out.print(" ");
            }

            for(j=0; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
