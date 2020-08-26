package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
 /*Main class to check number is palindrome and sum of even less than or grater than 25*/
    public static void main(String[] args) {
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =  s.nextInt();
/*method pal invocation  */
        m.pal(num);

    }
/*Method to check palindrome and check sum of even*/
    public void pal(int num){
        int r;
/*Setting counter for sum and even_sum*/
        int sum=0;
        int eve=0;
        int temp = num;
/*Reverse the number to check palindrome*/
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
/* Check if even and increament counter*/
            if( r %2 == 0){
                eve = r + eve;
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
