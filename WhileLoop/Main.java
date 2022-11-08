package com.WhileLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WhileLoop sum = new WhileLoop();
        System.out.println("which program you want to see:\n" +
                "1: for sum of natural number \n" +
                "2: for reverse of number \n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        //(1)
        // Write a program for the sum of n natural numbers
        // eg. Input N=5 output 1+2+3+4+5

        //(2)
        // Write a Program to reverse the integer number
        // eg. Input n=231 reverse is 132

        if (choice == 1) {
            WhileLoop.sumOfNaturalNumbers();
        } else if (choice == 2) {
            WhileLoop.reverseTheNumber();
        }


    }
}
