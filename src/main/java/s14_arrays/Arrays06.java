package s14_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arrays06 {

    /*
    Example 1: Sort the String Array elements according to their length from smallest to largest.
        [Orchid, Rose, Tulip, Begonia] --> [Rose, Tulip, Orchid, Begonia]
    Example 2: Sort the String Array elements according to their length from largest to smallest.
        [Orchid, Rose, Tulip, Begonia] --> [Begonia, Orchid, Tulip, Rose]
    Example 3: Sort the String Array elements according to their length from largest to smallest. Put those with the same
    number of characters in alphabetical order.
        [Orchid, Rose, Magnolia, Lily, Lotus, Jasmine, Camellia, Tulip, Begonia] -->
           6      4       8       4      5       7        8        5       7
        [Camellia, Magnolia, Begonia, Jasmine, Orchid, Lotus, Tulip, Lily, Rose]
     */
    public static void main(String[] args) {

        String[] flowers = {"Orchid", "Rose", "Tulip", "Begonia"};

        //Example 1:
        Arrays.sort(flowers, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(flowers));//[Rose, Tulip, Orchid, Begonia]

        //Example 2:
        Arrays.sort(flowers, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(flowers));//[Begonia, Orchid, Tulip, Rose]
        //or;
        //Arrays.sort(flowers, Comparator.naturalOrder());
        //System.out.println(Arrays.toString(flowers));//[Begonia, Orchid, Rose, Tulip]

        //Example 3:
        String[] newFlowers ={"Orchid", "Rose", "Magnolia", "Lily", "Lotus", "Jasmine", "Camellia", "Tulip", "Begonia"};

        Arrays.sort(newFlowers, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(newFlowers));//[Camellia, Magnolia, Begonia, Jasmine, Orchid, Lotus, Tulip, Lily, Rose]
    }
}