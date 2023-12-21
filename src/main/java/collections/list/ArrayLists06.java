package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists06 {

    /*
    Print the elements in a given List without repetition.
        [2, 3, 2, 2, 3, 5] --> [2, 3, 5]
     */
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        System.out.println(numbers);//[2, 3, 2, 2, 3, 5]

        List<Integer> newNumbers = new ArrayList<>();

        for (Integer w : numbers){
            if (!newNumbers.contains(w)){
                newNumbers.add(w);
            }
        }
        System.out.println(newNumbers);//[2, 3, 5]
    }
}
