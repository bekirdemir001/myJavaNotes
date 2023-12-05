package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorMethods {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Angelina");
        list.add("Morgan");

        System.out.println(list);//[Tom, Angelina, Morgan]

        //Let's create an Iterator;
        Iterator<String> itr1 = list.iterator();

        while (itr1.hasNext()){
            itr1.next();
            itr1.remove();
        }
        System.out.println(list);//[]
    }
}