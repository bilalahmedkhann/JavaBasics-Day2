package com.SwitchStatements;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;


public class SwitchStat {

    public void VowelConsonant() {
        System.out.println("Enter an alphabet :");
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        toLowerCase(alphabet);
        boolean isVowel;
        switch (alphabet) {
            case 'a':
                isVowel = true;
                break;
            case 'e':
                isVowel = true;
                break;
            case 'i':
                isVowel = true;
                break;
            case 'o':
                isVowel = true;
                break;
            case 'u':
                isVowel = true;
                break;
            case 'A':
                isVowel = true;
                break;
            case 'E':
                isVowel = true;
                break;
            case 'I':
                isVowel = true;
                break;
            case 'O':
                isVowel = true;
                break;
            case 'U':
                isVowel = true;
                break;
            default:
                isVowel = false;
                break;
        }
        if (isVowel) {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a Consonant");
        }
    }
    public void MonthNameByNumber() {
        System.out.println("Enter a month number :");
        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        String monthName = null;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        System.out.println(monthName);
    }
}
