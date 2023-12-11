package s10_ifstatements;

import java.util.Scanner;

public class IfStatement {

    /*
    Create the code that prints whether the number received from the user is odd or even.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        //1. yol:
        if (number % 2 == 0){
            System.out.println("Even number");
        }

        if (number % 2 != 0){
            System.out.println("Odd number");
        }
    }
}