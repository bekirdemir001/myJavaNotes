package s13_loops.dowhileloops;

import java.util.Scanner;

public class DoWhileLoop01 {

    /*
    Get an integer from the user,
         If the integer is less than 100, "You Lose!" End the game by giving the message.
         If the integer is 100 and greater than 100, "You won!" Continue the game by giving the message.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter a number");
            number = scanner.nextInt();
            if (number>99){
                System.out.println("You won!");
            }
        }while (number>99);
        System.out.println("You Lose!");
    }
}
