package collections.sets;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<String> sortedStrings = new TreeSet<>(Set.of("a", "b", "c", "d", "e", "f"));
        System.out.println("sortedString: " + sortedStrings);
        NavigableSet<String> reversedString = sortedStrings.descendingSet();
        System.out.println("reversed string: " + reversedString);
    }
}
