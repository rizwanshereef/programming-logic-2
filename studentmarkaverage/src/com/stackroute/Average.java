package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
/*Main class to find average, max,min marks*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int num = scan.nextInt();
        int mark [] = new int[num];
        int sort[] = new int[num];
        int sum =0;
/*Inserting the marks of students*/
        for(int i=0; i<num; i++){
            System.out.println("Enter the mark for student " + (i + 1));
            mark[i] = scan.nextInt();

            if (mark[i] >= 0 && mark[i] <= 100){
                sum = sum + mark[i];
            } else {
                System.out.println("Enter valid number!");
                System.exit(0);
            }
        }
/*Invoke methods to find average,max and min mark*/
        avg(sum,num);
        min(mark);
        max(mark);


    }
/*Method to find the average mark of student*/
    public  static void avg (int sum, int num){
        float avg = (float)sum/num;
        System.out.println("The Average is:" +avg);
    }
/*Method to find the max mark*/
    public  static void min(int mark[]){
        Arrays.sort(mark);
        System.out.println(" The minimum is: "+mark[0]);
    }
/*Method to find the min mark*/
    public static void max(int mark[]){
        Arrays.sort(mark);
        int max_mark = mark.length-1;
        System.out.println(" The maximum is: "+mark[max_mark]);
    }
}
