package collections.sets;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> strings = new TreeSet<>(Set.of("a", "b", "c", "d", "e", "f"));
        SortedSet<String> subSet = strings.subSet("aa", "d");
        System.out.println("subSet: " + subSet);
    }
}
