package com.WhileLoop;

import java.util.Scanner;

public class WhileLoop {

    public static void sumOfNaturalNumbers() {
        System.out.println("Enter natural number to get sum: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1, sum = 0;
        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }




}
