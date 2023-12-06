package s04_objectcreation;

import java.util.Scanner;

public class Scanner01 {

    //Write the code that takes two numbers from the user, performs 4 operations, and prints the operations on the screen.

    public static void main(String[] args) {

        // 1. Create Scanner Object
        Scanner scanner = new Scanner(System.in);

        //2. Give message to the user
        System.out.println("Enter first number");

        //3. Put the data comes from the user into memory using appropriate method
        int firstNumber = scanner.nextInt();

        //2. Give message to the user
        System.out.println("Enter second number");

        //3. Put the data comes from the user into memory using appropriate method
        int secondNumber = scanner.nextInt();
        if (secondNumber == 0){
            System.out.println("Please enter a new number different from 0");
            secondNumber = scanner.nextInt();
        }
        //4. Use the data in memory in our codes
        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / secondNumber));
    }
}