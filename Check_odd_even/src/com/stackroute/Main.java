package com.stackroute;

import java.util.Scanner;
/*Class to check whether the entered no is odd or even and is between 20 and 30*/
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
/*Input number*/
        System.out.println("Enter the number");
        int num = s.nextInt();
/*Check if the number is odd or even and satisfies the condition*/
        if(num % 2== 0 && num > 20 && num <30)
        {
            System.out.println("Jerry");
        }
        else if (num %2 !=0 && num >20 && num <30)
        {
            System.out.println("Tom");
        }
        else
        {
            System.exit(0);
        }
    }
}
