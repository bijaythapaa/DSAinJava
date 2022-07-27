package streams.intermediateoperations.concate;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatOne {
    public static void main(String[] args) {
        List<Integer> list0 = List.of(1, 2, 3);
        List<Integer> list1 = List.of(4, 5, 6);
        List<Integer> list2 = List.of(7, 8, 9);

        // 1st approach : concat()
        List<Integer> concat = Stream.concat(list0.stream(), list1.stream()).collect(Collectors.toList());

        // 2nd approach: flatMap
        List<Integer> flatMap = Stream.of(list0.stream(), list1.stream(), list2.stream())
                .flatMap(Function.identity())
                .collect(Collectors.toList());
        System.out.println("concat: " + concat);
        System.out.println("flatMap: " + flatMap);
    }
}
