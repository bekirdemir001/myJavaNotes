package s13_loops.foreachloop;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ForEachLoop03 {

    /*
    Type the code that finds the number of vowels in a String.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();

        //1. Way: replaceAll()
        String vowels = str.replaceAll("[^aeiouAEIOU]", "");
        System.out.println("The number of vowels(replace()): " + vowels.length());

        //2. Way: For-Loop
        int counter = 0;
        for (int i=0; i<str.length(); i++){
            switch (str.toLowerCase().charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
            }
        }
        System.out.println("The number of vowels(For-Loop): " + counter);

        //3. Way: For-Each-Loop
        String[] str2 = str.split("");
        System.out.println(Arrays.toString(str2));//[J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]
        int counter2 = 0;
        for (String w : str2){
            switch (w.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter2++;
            }
        }
        System.out.println("The number of vowels(For-Each-Loop): " + counter2);

        scanner.close();
    }
}
