package s10_ifstatements;

import java.util.Scanner;

public class NestedIfStatement {

    /*
    Get 3 positive integers from the user.
    Check if these 3 numbers form a triangle.
    If it is a triangle, check whether it is an "equilateral" triangle.

    Note: Condition for being a triangle:
        1. The sum of any two sides must be greater than the third side
        2. The difference of any two sides must be less than the third side
            a+b > c > |a-b|
            a+c > b > |a-c|
            b+c > a > |b-c|
    Note: If a=b=c then equilateral
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers for side lengths of a triangle");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        boolean isTriangle = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c > a && a>Math.abs(b-c));

        if (a<=0 || b<=0 || c<=0){
            System.out.println("You don't enter negative numbers for side lengths");
        }else if (isTriangle){
            if (a==b && a==c && b==c){
                System.out.println("Both triangle and equilateral");
            }else {
                System.out.println("Triangle but not equilateral");
            }
        }else {
            System.out.println("Not triangle");
        }
    }
}