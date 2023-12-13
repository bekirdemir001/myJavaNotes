package s12_switchstatements;

import java.util.Scanner;

public class Switch02 {

    /*
    Type the code that takes two numbers and the operation to be performed from the user and performs the operations +, -, *, /, %.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Choose operation to be performed: +, -, *, /, %");
        char operation = scanner.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a * b / 100));
                break;
            default:
                System.out.println("This operation cannot be defined");
        }

        scanner.close();
    }
}