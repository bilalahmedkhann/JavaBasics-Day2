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
}
