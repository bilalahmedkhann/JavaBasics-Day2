//Write a program SpringSeason.java that takes two int values m and d from the command line
// and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20),
// false otherwise.
package com.OperatorPrograms;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        int date, month;
        boolean isSpringSeason = false;
        System.out.println("Enter date and month of your choice: ");
        Scanner sc = new Scanner(System.in);
        date = sc.nextInt();
        month = sc.nextInt();
        if ((date > 20 && month < 6 && month >= 3) || (date < 20 && month <= 6 && month > 3))
            isSpringSeason = true;
        else
            isSpringSeason = false;
        System.out.println(isSpringSeason);

   
    }
}



