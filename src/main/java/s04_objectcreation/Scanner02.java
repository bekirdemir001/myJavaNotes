package s04_objectcreation;

import java.util.Scanner;

public class Scanner02 {

    //Get a 5-digit number from the user. Write the code that prints the sum of the digits of this number.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 5-digit number");

        int number = scanner.nextInt();

        //Get last digits
        int lastDigit = number % 10;
        number /= 10;

        //Get fourth digits
        int fourthDigit = number % 10;
        number /= 10;

        //Get third digits
        int thirdDigit = number % 10;
        number /= 10;

        //Get second digits
        int secondDigit = number % 10;
        number /= 10;

        //Get first digits
        int firstDigit = number % 10;
        number /= 10;

        System.out.println("Sum of digits: " + (firstDigit + secondDigit + thirdDigit + fourthDigit + lastDigit));
    }
}
