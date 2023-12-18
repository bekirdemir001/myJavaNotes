package s13_loops.whileloops;

import java.util.Scanner;

public class WhileLoop01 {

    /*
    Type the code that prints the sum of the digits of an integer received from the user.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        number = Math.abs(number);

        //For example: 5232 --> 5 + 2 + 3 + 2 = 12

        //1 Way: For-Loop
        int sum = 0;
        for(int i = number; i>0; i /= 10){
            sum += i%10;
        }
        System.out.println("The sum of numbers: " + sum);

        //2. Way: While-Loop
        int sum2 = 0;
        int i = number;
        while (i>0){
            sum2 += i%10;
            i/=10;
        }
        System.out.println("The sum of numbers: " + sum2);
    }
}