package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

    /*
    Type the code that finds the total number of vowel characters in the elements of a given String List.
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
        int sumOfVowelCharacters1 = 0;

        for (String w : cars){
            sumOfVowelCharacters1 += w.replaceAll("[^aeiouAEIOU]", "").length();
        }
        System.out.println(sumOfVowelCharacters1);//11

        //2.Way: For-Loop
        int sumOfVowelCharacters2 = 0;

        for (int i=0; i<cars.size(); i++){
            sumOfVowelCharacters2 += cars.get(i).replaceAll("[^aeiouAEIOU]", "").length();
        }
        System.out.println(sumOfVowelCharacters2);//11

        //3.Way: While-Loop
        int sumOfVowelCharacters3 = 0;

        int i = 0;
        while (i<cars.size()){
            sumOfVowelCharacters3 += cars.get(i).replaceAll("[^aeiouAEIOU]", "").length();
            i++;
        }
        System.out.println(sumOfVowelCharacters3);//11
    }
}