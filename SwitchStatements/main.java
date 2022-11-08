package com.SwitchStatements;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SwitchStat s = new SwitchStat();
        System.out.println("Enter your choice program: \n" +
                "1) for program to Check Vowel or Consonant\n" +
                "2) for Program to print the month name for the given number");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            s.VowelConsonant();
        } else if (choice == 2) {
            s.MonthNameByNumber();
        }


    }
    //1. Write a Program to Check Vowel or Consonant
    //2. Write a Program to print the month name for the given number

}
