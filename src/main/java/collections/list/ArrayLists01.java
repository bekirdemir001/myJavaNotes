package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists01 {

    /*
    Type the code that finds the total number of characters in the elements of a given String List.
     */
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Mercedes");
        cars.add("BMV");
        cars.add("Ford");
        cars.add("Seat");
        cars.add("Toyota");

        //1.Way: For-Each-Loop (Recommended)
        int sumOfCharacter1 = 0;

        for (String w : cars){
            sumOfCharacter1 += w.length();
        }
        System.out.println(sumOfCharacter1);//30

        //2.Way: For-Loop
        int sumOfCharacter2 = 0;

        for (int i=0; i<cars.size(); i++){
            sumOfCharacter2 += cars.get(i).length();
        }
        System.out.println(sumOfCharacter2);//30

        //3.Way: While-Loop
        int sumOfCharacter3 = 0;

        int i = 0;
        while (i<cars.size()){
            sumOfCharacter3 += cars.get(i).length();
            i++;
        }
        System.out.println(sumOfCharacter3);//30
    }
}