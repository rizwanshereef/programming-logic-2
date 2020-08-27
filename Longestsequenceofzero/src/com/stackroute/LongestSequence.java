package com.stackroute;

import java.util.Scanner;
/*Main class to check longest sequence of zero by converting decimail to variable*/
public class LongestSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*Insert number*/
        System.out.println("Enter the number:");
        int num = scan.nextInt();
/*Initialize count variable*/        
        int maxm = -1;
        int count = 0;
/*Convert and check sequence while increasing count variable*/
        while (num != 0) {
            if ((num & 1) == 0 ) {
                count++;
                num = num / 2;
                maxm = Math.max(maxm, count);
            }
            else {

                maxm = Math.max(maxm, count);
                count = 0;
                num = num / 2;
            }
        }
        System.out.println("Length of longest sequential zero: "+maxm);

    }

}



