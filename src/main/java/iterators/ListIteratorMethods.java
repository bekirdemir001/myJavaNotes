package iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods {
    public static void main(String[] args) {

        //Example 1:
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Angelina");
        list.add("Morgan");

        System.out.println(list);//[Tom, Angelina, Morgan]

        ListIterator<String> listItr = list.listIterator();

        while (listItr.hasNext()){
           String element = listItr.next();
           listItr.set(element + "!");
        }
        System.out.println(list);//[Tom!, Angelina!, Morgan!]

        //Example 2:
        List<String> list2 = new ArrayList<>();
        list2.add("Tom");
        list2.add("Angelina");
        list2.add("Morgan");

        System.out.println(list2);//[Tom, Angelina, Morgan]

        ListIterator<String> listItr2 = list2.listIterator();
            //First, let's take pointer to the end
        while (listItr2.hasNext()){
            listItr2.next();
        }
            //Second, let's come from end.
        while (listItr2.hasPrevious()){
            String element = listItr2.previous();
            System.out.print("-->" + element);
        }
    }
}