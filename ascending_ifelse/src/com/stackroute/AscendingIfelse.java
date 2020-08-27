package com.stackroute;

import java.util.Scanner;

public class AscendingIfelse {
/*Main class to sort number using if-else*/
        public static void main(String[] args) {
	    int numOne,numTwo,numThree,numFour;
/*Break the 4 digits to min1, min2,max1,max2,low,high,mid1,mid2 for comparison and sorting*/
	    int min1, min2, max1, max2,low, high, mid1, mid2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        numOne = scan.nextInt();
        System.out.println("Enter 2nd number:");
        numTwo = scan.nextInt();
        System.out.println("Enter 3rd number:");
        numThree = scan.nextInt();
        System.out.println("Enter 4th number:");
        numFour = scan.nextInt();
/*Compare values and arrange positions*/
        if(numOne<numTwo){
            min1 = numOne;
            max1 = numTwo;
        }
        else{
            min1 = numTwo;
            max1 = numOne;
        }

        if (numThree<numFour){
            min2 = numThree;
            max2 = numFour;
        }
        else {
            min2 = numFour;
            max2 = numThree;
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
