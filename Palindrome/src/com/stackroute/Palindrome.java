package com.stackroute;

import java.util.Scanner;

public class Palindrome {
 /*Main class to check number is palindrome and sum of even less than or grater than 25*/
    public static void main(String[] args) {
        Palindrome palOne = new Palindrome();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =  scan.nextInt();
/*method pal invocation  */
        palOne.pal(num);

    }
/*Method to check palindrome and check sum of even*/
    public void pal(int num){
        int rem;
/*Setting counter for sum and even_sum*/
        int sum=0;
        int eve=0;
        int temp = num;
/*Reverse the number to check palindrome*/
        while (num>0){
            rem=num%10;
            sum=(sum*10)+rem;
/* Check if even and increament counter*/
            if( rem %2 == 0){
                eve = rem + eve;
            }
            num = num/10;
        }
        num = temp;
/*Check if palindrome and sum of even is less than or greater than 25 */
        if(temp == sum && eve <25){
            System.out.println(num +" is palindrome and the sum of even number is less than 25 ");
        }
         else if(temp == sum && eve >25){
            System.out.println(num +"is palindrome and the sum of even number is greater than 25");
        }
        else{
            System.out.println("Number is not palindrome");
            System.exit(0);
        }

    }


}
