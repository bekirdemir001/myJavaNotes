package s10_ifstatements;

import java.util.Scanner;

public class IfElseIfStatement {

    /*
    Create the code that prints whether the number received from the user is positive, negative or neutral.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0){
            System.out.println("Negative Number");
        } else {
            System.out.println("Neutral Number");
        }




    }
}