package collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ManagingContents {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", null);
        map.put("three", 3);
        map.put("four", null);
        map.put("five", 5);

        // this throws NullPointerException
//        for (int value : map.values()) {
//            System.out.println("value= " + value);
//        }

        for (String key : map.keySet()) {
            map.putIfAbsent(key, -1);
        }

        for (int value : map.values()) {
            System.out.println("value= " + value);
        }

        Map<Integer, String> mapTwo = new HashMap<>();
        mapTwo.put(1, "one");
        mapTwo.put(2, "two");
        mapTwo.put(3, "three");
        List<String> values = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            values.add(mapTwo.getOrDefault(i, "UNDEFINED"));
        }
        System.out.println("values = " + values);

        List<String> valueList = IntStream.range(0, 5)
                .mapToObj(key -> mapTwo.getOrDefault(key, "UNDEFINED"))
                .collect(Collectors.toList());
        System.out.println("valueList = " + valueList);

        Map<Integer, String> mapFour = Map.ofEntries(
                Map.entry(1, "one"),
                Map.entry(2, "two"),
                Map.entry(3, "three"),
                Map.entry(4, "three")
        );
        for (Map.Entry<Integer, String> entry : mapFour.entrySet()) {
            System.out.println("entry = " + entry);
        }

    }
}
