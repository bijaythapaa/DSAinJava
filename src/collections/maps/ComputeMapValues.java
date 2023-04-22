package collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : bijay.thapa
 * @created : 4/15/23, Saturday
 * @Description :
 **/
public class ComputeMapValues {
    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven");
        Map<Integer, List<String>> map = new HashMap<>();
//        for (String word : strings) {
//            int length = word.length();
//            if (!map.containsKey(length)) {
//                map.put(length, new ArrayList<>());
//            }
//            map.get(length).add(word);
//        }
//        map.forEach((key, value) -> System.out.println(key + " :: " + value));

        /* via putIfAbsent() */
//        for (String word : strings) {
//            int length = word.length();
//            map.putIfAbsent(length, new ArrayList<>());
//            map.get(length).add(word);
//        }
//        map.forEach((key, value) -> System.out.println(key + " :: " + value));

        /* via computeIfAbsent() (preferable way) */
//        for (String word : strings) {
//            map.computeIfAbsent(word.length(), key -> new ArrayList<>()).add(word);
//        }
        strings.forEach(word -> map.computeIfAbsent(word.length(), key -> new ArrayList<>()).add(word));
        map.forEach((key, value) -> System.out.println(key + " :: " + value));

        /* compute() works only for mutable type values.
         * So, to work on immutable type, we have merge() */
        Map<Integer, String> mapFromMerge = new HashMap<>();
        strings.forEach(word -> mapFromMerge.merge(word.length(), word,
                (existingValue, newWord) -> existingValue + ", " + newWord));
        mapFromMerge.forEach((key, value) -> System.out.println(key + " :: " + value));
    }
}
