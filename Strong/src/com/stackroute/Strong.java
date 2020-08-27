package com.stackroute;

import java.util.*;

public class Strong {
/*Main Class to find if the number is Strong*/
	public static void main(String[] args) {
		int num,itr;
		int fact,rem;
		Scanner scan = new Scanner(System.in);
/*Input the number*/
		System.out.print("\nEnter the number : ");
		num = scan.nextInt();
		int sum = 0;
		int temp = num;
/*Check whether the number is strong*/
		while(num != 0){
			itr = 1;
			fact = 1;
			rem = num % 10;

			while(itr <= rem){
				fact = fact * itr;
				itr++;
			}
			sum = sum + fact;
			num = num / 10;
		}

		if(sum == temp)
			System.out.println(temp + " is a strong number\n");
		else
			System.out.println(temp + " is not a strong number\n");

		System.out.println();
	}
}