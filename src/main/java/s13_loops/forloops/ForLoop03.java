package s13_loops.forloops;

import java.util.Scanner;

public class ForLoop03 {

    /*
    Type the code that checks whether a String received from the user is a palindrome.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        if (str.equalsIgnoreCase(sb.toString())){
            System.out.println(str + " is a Palindrome");
        }else {
            System.out.println(str + " isn't a Palindrome");
        }

        scanner.close();
    }
}