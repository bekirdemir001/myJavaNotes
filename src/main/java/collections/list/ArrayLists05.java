package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists05 {

    /*
    Increase the values of all elements except 7 in an Integer List by 3.
     */
    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(23);
        ages.add(7);
        ages.add(11);
        ages.add(35);

        //With For-Each-Loop
        for (Integer w : ages){
            if (w == 7){
                continue;
            }
            ages.set(ages.indexOf(w), w+3);
        }
        System.out.println("For-Each-Loop: " + ages);

        //With For-Loop (Recommended)
        List<Integer> ages2 = new ArrayList<>();
        ages2.add(12);
        ages2.add(23);
        ages2.add(7);
        ages2.add(11);
        ages2.add(35);
        for (int i=0; i< ages2.size(); i++){
            int element =ages2.get(i);
            if (element ==7){
                continue;
            }
            ages2.set(i, ages2.get(i)+3);
        }
        System.out.println("For-Loop: " + ages2);//[15, 26, 7, 14, 38]

    }
}