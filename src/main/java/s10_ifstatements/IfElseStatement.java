package s10_ifstatements;

import java.util.Scanner;

public class IfElseStatement {

    /*
    Create a code that prints "Upper Letter" on the console if the character received from the user is uppercase, and
    prints "Lower Letter" on the console if it is lowercase.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().charAt(0);

        //1. Way:
        //if (ch >= 'A' && ch <= 'Z') {
        //    System.out.println("Upper Letter");
        //}

        //if (ch >= 'a' && ch <= 'z') {
        //    System.out.println("Lower Letter");
        //}

        //2. Way:
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper Letter");
        } else {
            System.out.println("Lower Letter");
        }
    }
}