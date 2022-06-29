package collections.iteratingovercollection;

import java.util.Collection;
import java.util.List;

public class ForEachPattern {
    /* very Efficient for Read operation only */
    public static void main(String[] args) {
        Collection<String> strings = List.of("one", "two", "three");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
