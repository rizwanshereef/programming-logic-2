package com.stackroute;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numOne,numTwo;
        int switch_num;
        String ch = "y";
/*Infinite loop to check if user needs to continue*/
        while(true){

            System.out.println(" Enter the first number:");
            numOne = scan.nextDouble();
            System.out.println(" Enter the second number:");
            numTwo= scan.nextDouble();
            System.out.println("Enter number beside the operation to perform: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
/*Switch cases to select the output*/            
            switch_num=scan.nextInt();
                switch(switch_num) {
                    case 1:
                        System.out.println(+numOne + "+" + numTwo + "=" + (numOne + numTwo));
                        System.out.println("Do you want to try again(y/n):");
                        ch = scan.next();
                        if(ch.equals("y")) {
                            break;
                        }
                        else System.exit(0);
                    case 2:
                        System.out.println(+numOne + "-" + numTwo + "=" + (numOne - numTwo));
                        System.out.println("Do you want to try again(y/n):");
                        ch = scan.next();
                        if(ch.equals("y")) {
                            break;
                        }
                        else System.exit(0);
                    case 3:
                        System.out.println(+numOne + "*" + numTwo + "=" + (numOne * numTwo));
                        System.out.println("Do you want to try again(y/n):");
                        ch = scan.next();
                        if(ch.equals("y")) {
                            break;
                        }
                        else System.exit(0);
                    case 4:
                        System.out.println(+numOne + "/" + numTwo + "=" + (numOne / numTwo));
                        System.out.println("Do you want to try again(y/n):");
                        ch = scan.next();
                        if(ch.equals("y")) {
                            break;
                        }
                        else System.exit(0);
                    default: {
                        System.out.println("Enter numOne valid number!!");
                    }
                }

            }
        }

    }
