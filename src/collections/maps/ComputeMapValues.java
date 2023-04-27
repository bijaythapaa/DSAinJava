package collections.maps;

import java.util.*;
import java.util.stream.Collectors;

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

        /* Manipulating (N*3) metrics */
        String[][] tableNx3 = {
                {"a", "ab", "abc"},
                {"a", "ab", "bcd"},
                {"a", "bc", "cdf"},
                {"b", "ab", "abc"},
                {"b", "ce", "def"}
        };
        /* Solution One */
        Map<String, Map<String, Set<String>>> mapMapOne = new HashMap<>();
        Arrays.asList(tableNx3).forEach(row -> mapMapOne.computeIfAbsent(row[0], k -> new HashMap<>())
                .computeIfAbsent(row[1], k -> new HashSet<>())
                .add(row[2]));
        System.out.println(mapMapOne);

        /* Solution Two */
        Map<String, Map<String, Set<String>>> mapMapTwo = new HashMap<>();
        Arrays.asList(tableNx3).forEach(row -> mapMapTwo.computeIfAbsent(row[0], k -> new HashMap<>())
                .computeIfAbsent(row[1], k -> new HashSet<>())
                .add(row[2]));
        System.out.println(mapMapTwo);

        /* Solution Three */
        Map<String, Map<String, Set<String>>> mapMapThree = new HashMap<>();

        Arrays.asList(tableNx3).forEach(row -> mapMapThree.computeIfAbsent(row[0], k -> new HashMap<>())
                .computeIfAbsent(row[1], k -> Arrays.stream(new String[]{row[2]}).collect(Collectors.toSet()))
                .add(row[2]));
        System.out.println(mapMapThree);

        /* Manipulating (N*2) metrics */
        String[][] tableNx2 = {
                {"a", "ab"},
                {"a", "bc"},
                {"a", "cd"},
                {"b", "ab"},
                {"b", "ce"},
                {"b", "bc"},
                {"c", "ab"},
                {"c", "ef"}
        };
        /* Solution One */
        Map<String, List<String>> resultOne = Arrays.stream(tableNx2).collect(Collectors.groupingBy(row -> row[0],
                Collectors.mapping(row -> row[1], Collectors.toList())));
        System.out.println(resultOne);

        /* Solution Two */
        Map<String, Set<String>> resultTwo = Arrays.stream(tableNx2).collect(Collectors.groupingBy(row -> row[0],
                Collectors.mapping(row -> row[1], Collectors.toSet())));
        System.out.println(resultTwo);
    }
}
