package collections.sets;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/*
* Java SE 6 saw the introduction of an extension of SortedSet with the addition of more methods.
* It turns out that the TreeSet class was retrofitted to implement NavigableSet.
* So you can use the same class for both interfaces.
*/

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<String> sortedStrings = new TreeSet<>(Set.of("a", "b", "c", "d", "e", "f"));
        System.out.println("sortedString: " + sortedStrings);
        NavigableSet<String> reversedString = sortedStrings.descendingSet();
        System.out.println("reversed string: " + reversedString);
    }
}
