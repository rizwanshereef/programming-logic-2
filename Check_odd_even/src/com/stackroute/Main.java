package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
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
