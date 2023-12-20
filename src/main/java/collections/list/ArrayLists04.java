package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists04 {

    /*
    Create an Integer List. Type the code that prints the two closest integers in the list.
        [12, 23, 9, 11, 35] --> 12 11
     */

    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(23);
        ages.add(10);
        ages.add(11);
        ages.add(35);

        //1. Step: Sort List
        Collections.sort(ages);
        System.out.println(ages);//[9, 11, 12, 23, 35]

        //2. Steps: Create integer minDiff variable and assign the first two elements of List.
        int minDiff = ages.get(1)-ages.get(0);

        //3. Steps: Find minimum value of minDiff comparing other values
        for (int i=1; i<ages.size(); i++) {
            minDiff = Math.min(minDiff, ages.get(i) - ages.get(i - 1));
        }
        System.out.println(minDiff);//1

        //4. Steps: Find which the differences of values equal to minDiff.
        for (int i=1; i<ages.size(); i++){
            if (ages.get(i) - ages.get(i-1) == minDiff){
                System.out.println(ages.get(i-1) + " and " + ages.get(i));//11 and 12
            }
        }

    }
}