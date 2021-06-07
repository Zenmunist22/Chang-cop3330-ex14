package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App 
{
    public static void main( String[] args )
    {
        String state;
        double orderAmount = 0, tax = 0,taxAmount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        orderAmount = sc.nextDouble();
        sc.nextLine();
        System.out.print("What is the state? ");
        state = sc.nextLine();
        if (state.equals("WI")) {
            tax = .055;
            System.out.printf("The subtotal is: $%.2f\n", orderAmount);
            taxAmount = (int) (.5 + (100 * (orderAmount * tax)));
            taxAmount /= 100;
            System.out.printf("The tax is $%1.2f\n", taxAmount);
        }
        System.out.printf("The total is $%.2f", orderAmount + taxAmount );
    }
}
