package s09_stringmanipulations;

import java.util.Scanner;

public class StringManipulations04 {

    /*
    Check the password entered by the user according to the rules below.
         1. There must be at least 8 characters.
         2. No Space character.
         3. There must be at least one capital letter.
         4. There must be at least one lowercase letter.
         5. There must be at least one symbol (other than letters and numbers).
         6. There must be at least one number.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your valid password");

        String password = scanner.nextLine();

        //1. There must be at least 8 characters.
        boolean first = password.length()>7;
        System.out.println(first);

        //2. No Space character.
        boolean second = !password.contains(" ");
        System.out.println(second);

        //3. There must be at least one capital letter.
        boolean third = password.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println(third);

        //4. There must be at least one lowercase letter.
        boolean fourth = password.replaceAll("[^a-z]", "").length() > 0;
        System.out.println(fourth);

        // 5. There must be at least one symbol (other than letters and numbers).
        boolean fifth = password.replaceAll("[a-zA-Z0-9]", "").length() > 0;
        System.out.println(fifth);

        //6. There must be at least one number.
        boolean sixth = password.replaceAll("[^0-9]", "").length() > 0;
        System.out.println(sixth);

        System.out.println("Is Password Valid?: " + (first && second && third && fourth && fifth && sixth));
    }
}