package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists08 {

    /*
        Number Guessing Game
    Ask the player for a number between 1-10.
    If there is a number guessed by the player in the List we have, print "BINGO".
    Otherwise, add the number given to the List.
    The first person to complete "BINGO" wins the game. Then print "YOU WON".
        [5, 8, 2, 9] --> 2 --> [5, 8, BINGO, 9]
        [5, 8, 2, 9] --> 3 --> [5, 8, BINGO, 9, 3]
        [5, 8, BINGO, 9, 3] --> [BINGO, BINGO, BINGO, BINGO, BINGO] --> YOU WON
     */
    public static void main(String[] args) {

        List<String> numLists = new ArrayList<>();
        numLists.add("5");
        numLists.add("8");
        numLists.add("2");
        numLists.add("9");

        Scanner scanner = new Scanner(System.in);
        System.out.println("*********** WELCOME ************");
        System.out.println("For exit, press Q");

        int counter = 0;
        String num = "";
        do {
            System.out.println("Enter a number between 1 and 10");
            num = scanner.next();

            if (num.equalsIgnoreCase("Q")){
                break;
            } else if (numLists.contains(num)){
                System.out.println("BINGO");
                numLists.set(numLists.indexOf(num), "BINGO");
                counter++;
            }else {
                numLists.add(num);
            }
        }while (counter != numLists.size());

        if (num.equalsIgnoreCase("Q")){
            System.out.println("You left from the game, we wait you another game");
        }else {
            System.out.println("You won");
        }

        System.out.println("Final Report: " + numLists);

        scanner.close();
    }
}