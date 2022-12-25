package collections.maps;

import java.util.Map;

public class FactoryMethods {
    public static void main(String[] args) {
        // with this way, we can have only 10 entries.
        Map<Integer, String> mapFirst = Map.of(1, "One", 2, "Two", 3, "Three");

        // to have more, use this way
        Map.Entry<Integer, String> e1 = Map.entry(4, "Four");
        Map.Entry<Integer, String> e2 = Map.entry(5, "Five");
        Map.Entry<Integer, String> e3 = Map.entry(6, "Six");

        Map<Integer, String> mapSecond = Map.ofEntries(e1, e2, e3);

        // use static imports to further improve readability
        Map<Integer, String> mapThree = Map.ofEntries(
                Map.entry(7, "Seven"),
                Map.entry(8, "Eight"),
                Map.entry(9, "Nine")
        );
    }
}
