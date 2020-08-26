package com.stackroute;

import java.util.Scanner;
/*Main class to check longest sequence of zero by converting decimail to variable*/
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
/*Insert number*/
        System.out.println("Enter the number:");
        int N = s.nextInt();
/*Initialize count variable*/        
        int maxm = -1;
        int count = 0;
/*Convert and check sequence while increasing count variable*/
        while (N != 0) {
            if ((N & 1) == 0 ) {
                count++;
                N = N / 2;
                maxm = Math.max(maxm, count);
            }
            else {

                maxm = Math.max(maxm, count);
                count = 0;
                N = N / 2;
            }
        }
        System.out.println("Length of longest sequential zero: "+maxm);

    }

}



