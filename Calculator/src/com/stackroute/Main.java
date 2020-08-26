package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b;
        int num;
        String ch = "y";
/*Infinite loop to check if user needs to continue*/
        while(true){

            System.out.println(" Enter the first number:");
            a = s.nextDouble();
            System.out.println(" Enter the second number:");
            b= s.nextDouble();
            System.out.println("Enter number beside the operation to perform: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
/*Switch cases to select the output*/            
            num=s.nextInt();
                switch(num) {
                    case 1:
                        System.out.println(+a + "+" + b + "=" + (a + b));
                        System.out.println("Do you want to try again(y/n):");
                        ch = s.next();
                        if(ch.equals("y")) {
                            break;
                        }
                        else System.exit(0);
                    case 2:
                        System.out.println(+a + "-" + b + "=" + (a - b));
                        System.out.println("Do you want to try again(y/n):");
                        ch = s.next();
                        if(ch.equals("y")) {
                            break;
                        }
                        else System.exit(0);
                    case 3:
                        System.out.println(+a + "*" + b + "=" + (a * b));
                        System.out.println("Do you want to try again(y/n):");
                        ch = s.next();
                        if(ch.equals("y")) {
                            break;
                        }
                        else System.exit(0);
                    case 4:
                        System.out.println(+a + "/" + b + "=" + (a / b));
                        System.out.println("Do you want to try again(y/n):");
                        ch = s.next();
                        if(ch.equals("y")) {
                            break;
                        }
                        else System.exit(0);
                    default: {
                        System.out.println("Enter a valid number!!");
                    }
                }

            }
        }

    }
