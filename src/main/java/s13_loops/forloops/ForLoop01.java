package s13_loops.forloops;

import java.util.Scanner;

public class ForLoop01 {

    /*
    Type the code that prints all characters before the first letter 'a' in a String received from the user.
    For instance, I love Java --> I love J
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = scanner.nextLine();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a'){
                break;
            }
            System.out.print(ch);
        }

        scanner.close();
    }
}
