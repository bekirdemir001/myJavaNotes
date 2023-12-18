package s13_loops.foreachloop;

import java.util.Arrays;

public class ForEachLoop02 {

    /*
    Create a String Array. Insert 6 elements, delete elements with more than 5 characters.
     */
    public static void main(String[] args) {

        String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]

        //We need to find how many elements are less than 6 in the new array.
        int counter = 0;
        for (String w: colors){
            if (w.length()<6){
                counter++;
            }
        }
        System.out.println(counter);//4

        //Create a new Array
        String[] newColors = new String[counter];

        //Transfer characters less than 6 to array.
        int index = 0;
        for (String w: colors){
            if (w.length()<6){
                newColors[index] = w;
                index++;
            }
        }
        System.out.println(Arrays.toString(newColors));//[Red, Blue, Green, Brown]
    }
}