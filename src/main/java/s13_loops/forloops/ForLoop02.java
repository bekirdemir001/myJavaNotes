package s13_loops.forloops;

import java.util.Scanner;

public class ForLoop02 {

    /*
    Reverse a String received from the user.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);

        scanner.close();
    }
}