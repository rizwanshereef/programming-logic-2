package com.stackroute;

import java.util.Scanner;

public class Main {
/*Main class to sort number using if-else*/
        public static void main(String[] args) {
	    int a,b,c,d;
/*Break the 4 digits to min1, min2,max1,max2,low,high,mid1,mid2 for comparison and sorting*/
	    int min1, min2, max1, max2,low, high, mid1, mid2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        a = s.nextInt();
        System.out.println("Enter 2nd number:");
        b = s.nextInt();
        System.out.println("Enter 3rd number:");
        c = s.nextInt();
        System.out.println("Enter 4th number:");
        d = s.nextInt();
/*Compare values and arrange positions*/
        if(a<b){
            min1 = a;
            max1 = b;
        }
        else{
            min1 = b;
            max1 = a;
        }

        if (c<d){
            min2 = c;
            max2 = d;
        }
        else {
            min2 = d;
            max2 = c;
        }

        if(min1<min2){
            low = min1;
            mid1 = min2;
        }
        else{
            low=min2;
            mid1=min1;
        }

        if(max1>max2){
            high = max1;
            mid2 = max2;
        }
        else {
            high = max2;
            mid2 = max1;
        }

        if(mid1<mid2){
            System.out.println(low+","+mid1+","+mid2+","+high);
        }
        else{
            System.out.println(low+","+mid2+","+mid1+","+high);
        }
    }
}
