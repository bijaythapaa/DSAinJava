package collections.iteratingovercollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorOnCollection {
    /*
    allows to remove some of elements of our Collection while iterating over them
    */

    /*
     * The '.iterator()' method is defined inside Iterable interface, extended by Collection interface,
     * and further extended by all interfaces of Collection hierarchy.
     */

    public static void main(String[] args) {
        Collection<String> strings = List.of("one", "two", "three", "four", "five");
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();) {
            String element = iterator.next();

            /* on .remove() method throws UnsupportedOperationException since the collection type is immutable */
//            strings.removeIf(s -> s.length() == 3);
//            System.out.println(strings);

            if (element.length() == 3) {
                System.out.println(element);
            }
        }
    }
}
