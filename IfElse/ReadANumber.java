package com.IfElse;

import java.util.Scanner;

public class ReadANumber {
    public static void main(String[] args) {
        System.out.println("Choose any number between 0 to 10000:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0 && num < 10000) {
            numberToUnits(num);
        } else {
            System.out.println("Invalid input");
        }


    }

    private static void numberToUnits(int num) {
        if (num > 0 && num < 10) {
            System.out.println("Number is " + num + ", its unit is Ones");
        } else if (num > 9 && num < 100) {
            System.out.println("Number is " + num + ", its unit is Tens");
        } else if (num > 99 && num < 1000) {
            System.out.println("Number is " + num + ", its unit is Hundred");
        } else if (num > 999 && num < 10000) {
            System.out.println("Number is " + num + ", its unit is Thousand");
        }
    }
}
