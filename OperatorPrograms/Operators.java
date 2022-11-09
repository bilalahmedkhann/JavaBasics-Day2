package com.OperatorPrograms;

import java.util.Scanner;

public class Operators {
    int a, b, c;
    int result1, result2, result3, result4;

    String forMaxRes = null;
    String forMinRes = null;

    public void evaluateAndFindMinMax()  {
        System.out.println("Enter any three numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        result1 = a + b * c;
        result2 = c + a / b;
        result3 = a % b + c;
        result4 = a * b + c;
        System.out.println("Maximim Result is " + max(result1, result2, result3, result4) + " for " + forMaxRes);
        System.out.println("Minimum result is " + min(result1, result2, result3, result4) + " for " + forMinRes);

    }

    public int max(int result1, int result2, int result3, int result4) {
        int max = result1;
        forMaxRes = "a + b * c";
        if (result2 > max) {
            max = result2;
            forMaxRes = "c + a / b";
        }
        if (result3 > max) {
            max = result3;
            forMaxRes = "a % b + c";
        }
        if (result4 > max) {
            max = result4;
            forMaxRes = "a * b + c";
        }
        return max;
    }

    public int min(int result1, int result2, int result3, int result4) {
        int min = result1;
        forMinRes = "a + b * c";
        if (result2 < min) {
            min = result2;
            forMinRes = "c + a / b";
        }
        if (result3 < min) {
            min = result3;
            forMinRes = "a % b + c";
        }
        if (result4 < min) {
            min = result4;
            forMinRes = "a * b + c";
        }
        return min;
    }
}