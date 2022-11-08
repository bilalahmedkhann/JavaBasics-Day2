package com.WhileLoop;

import java.util.Scanner;

public class WhileLoop {

    public static void sumOfNaturalNumbers() {
        System.out.println("Enter natural numbers to get sum: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1, sum = 0;
        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
    public static void reverseTheNumber() {
        System.out.println("Enter any number to get its reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reversed number is " + reverse);
    }




}
