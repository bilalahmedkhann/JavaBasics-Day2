package com.OperatorPrograms;
import java.util.*;

public class QuadraticEquation {
    public static void main(String[] args) {


        System.out.println("Enter three numbers  a b c");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = ((-b + Math.sqrt(delta)) / (2 * a));
            double root2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.format("Root1 = %.2f and Root2 = %.2f", root1, root2);
        } else if (delta == 0) {
            double root1 = -b / (2.0 * a);
            System.out.println("Roots are equal. Root1=Root2= " + root1);
        } else System.out.println("Roots not real");
    }
}
