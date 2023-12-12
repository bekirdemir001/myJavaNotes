package s11_ternary;

import java.util.Scanner;

public class NestedTernary {

    /*
    Write the code that checks whether the given year is a leap year.
        1. If the year is divided by 100, it must also be divided by 400. 1600 --> Leap 1800 --> Not Leap
        2. If the year is not divisible by 100, it should be divided by 4. 2004 --> Leap 2005 --> Not Leap
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println(result);
    }
}