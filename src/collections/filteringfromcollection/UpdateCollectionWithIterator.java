package collections.filteringfromcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UpdateCollectionWithIterator {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            strings.remove(element);
//            strings.removeIf(s -> s.length()==3);
        }

//        for (String element : strings) {
//            strings.remove(element);
//        }

        System.out.println("strings: " + strings);
    }
}
