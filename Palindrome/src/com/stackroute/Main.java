package com.stackroute;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =  s.nextInt();
        m.pal(num);

    }

    public void pal(int num)
    {
        int r;
        int sum=0;
        int eve=0;
        int temp = num;
        while (num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            if( r %2 == 0)
            {
                eve = r + eve;
            }
            num = num/10;
        }
        num = temp;
        if(temp == sum && eve <25)
        {
            System.out.println(num +" is palindrome and the sum of even number is less than 25 ");
        }
         else if(temp == sum && eve >25)
        {
            System.out.println(num +"is palindrome and the sum of even number is greater than 25");
        }
        else
        {
            System.out.println("Number is not palindrome");
            System.exit(0);
        }

    }


}
