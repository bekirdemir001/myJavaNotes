package s13_loops.whileloops;

import java.util.Scanner;

public class WhileLoop02 {

    /*
    Type the code that creates the multiplication table for the number given by the user and prints it to the console.
        3 --> 3x1=3 3x2=6 3x3=9,...
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        byte number = scanner.nextByte();

        if (number<1 || number>10){
            System.out.println("Please enter a number from 1 to 10!");
        }else {
            int i=1;
            while (i<11){
                System.out.println(number + " x " + i + " = " + (number * i));
                i++;
            }
        }
    }
}
