/*          Read a single Digit Number and write in word         */

package com.IfElse;

import java.util.Scanner;

public class DigitIntoWord {
    public static void main(String[] args) {
        System.out.println("Enter any number between 0 to 9 only: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 10) {
            selectAnyNumber(num);
        } else {
            System.out.println("Invalid Input");
        }
    }

    private static void selectAnyNumber(int num) {
        if (num == 0) {
            System.out.println(num + " in digit is zero.");
        } else if (num == 1) {
            System.out.println(num + " in digit is one.");

        } else if (num == 2) {
            System.out.println(num + " in digit is two.");

        } else if (num == 3) {
            System.out.println(num + " in digit is three.");

        } else if (num == 4) {
            System.out.println(num + " in digit is four.");

        } else if (num == 5) {
            System.out.println(num + " in digit is five.");

        } else if (num == 6) {
            System.out.println(num + " in digit is six.");

        } else if (num == 7) {
            System.out.println(num + " in digit is seven.");

        } else if (num == 8) {
            System.out.println(num + " in digit is eight.");

        } else if (num == 9) {
            System.out.println(num + " in digit is nine.");

        }
    }
}
