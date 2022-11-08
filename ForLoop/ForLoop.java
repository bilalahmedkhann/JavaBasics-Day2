package com.ForLoop;

import java.util.Scanner;

public class ForLoop {
    public static void sumOfNaturalNumber() {
        int sum = 0;
        System.out.println("Enter any natural number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void reverseOfNumber() {
        int reverse = 0;
        int digit;
        System.out.println("Enter any natural number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (; num != 0; num = num / 10) {
            digit = num % 10;
            reverse = reverse * 10 + digit;

        }
        System.out.println(reverse);
    }

    public static void palindromeNumber() {
        int reverse = 0;
        int temp;
        int s;
        int rem;

        System.out.println("Enter any natural number to check for palindrome: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        temp = num;
        for (s = 0; num > 0; num = num / 10) {
            rem = num % 10;
            s = (s * 10) + rem;
        }
        if (s == temp) {
            System.out.println(temp + " is a palindrome number");

        } else {
            System.out.println(temp + " is not a palindrome number");
        }

    }

}
