package s11_ternary;

import java.util.Scanner;

public class Ternary {

    /*
    Get two numbers from the user and print the "not greater than (less than or equal to)" number.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two digits");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        //1. Way: If Else
        if (a<b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

        //2. Way: Ternary
        double result = a<b ? a : b;
        System.out.println(result);
    }
}