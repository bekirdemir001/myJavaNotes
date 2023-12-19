package s14_arrays;

import java.util.Arrays;

public class Arrays03 {

    /*
    Create a String Array and place 6 elements in it. Delete elements which are the number of characters more than 4.
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

        //Deletion Operation isn't used Arrays because of having constant element number. So, we create a new Array and
        //find have many elements in a new Array
        int counter = 0;

        for(String w : colors){
            if (w.length()>4) {
                counter++;
            }
        }
        System.out.println(counter);//4

        //Create a new Array
        String[] newColors = new String[counter];

        //Move elements to new Array.
        int index = 0;

        for (String w : colors){
            if(w.length()>4){
                newColors[index] = w;
                index++;
            }
        }
        System.out.println(Arrays.toString(newColors));//[Orange, Yellow, Green, Brown]
    }
}
