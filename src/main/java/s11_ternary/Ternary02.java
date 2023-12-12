package s11_ternary;

import java.util.Scanner;

public class Ternary02 {

    /*
    If two numbers have the same sign, write the code that multiplies these numbers, and if their signs are different,
    write the code that gives the message "I cannot multiply numbers with different signs."
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two digits");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Object result = (a>0 && b>0) || (a<0 && b<0) ? a*b : "I cannot multiply numbers with different signs.";
        System.out.println(result);

    }
}
