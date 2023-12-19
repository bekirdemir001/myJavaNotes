package s14_arrays;

import java.util.Arrays;

public class Arrays04 {

    /*
    Example 1: Create a String Array and place 6 elements in it. Print elements which are in front of "Yellow"
    Example 2: Create a String Array and place 6 elements in it. Print elements which are behind "Yellow"
     */
    public static void main(String[] args) {

        String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        //Example 1:
        for (String w : colors){
            if (w.equalsIgnoreCase("Yellow")){
                break;
            }else {
                System.out.print(w + " ");//Red Orange Blue
            }
        }

        System.out.println();

        //Example 2: It is not used For-Each-Loop here.
        //1. Way: For-Loop
        for (int i= colors.length-1; i>=0; i--){
            if(colors[i].equalsIgnoreCase("Yellow")){
                break;
            }else {
                System.out.print(colors[i] + " ");//Brown Green
            }
        }

        System.out.println();

        //2. Way: While-Loop
        int i = colors.length-1;
        while (i>=0){
            if (colors[i].equalsIgnoreCase("Yellow")){
                break;
            }else {
                System.out.print(colors[i] + " ");//Brown Green
            }
            i--;
        }

    }
}