package streams.intermediateoperations.map;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoOne {
    public static void main(String[] args) {
        List<String> lists = List.of("one", "two", "three", "four");
        Function<String, Integer> function = String::length;
        Stream<Integer> length = lists.stream().map(function);
        System.out.println(length); /*prints nothing*/

        /* optimize way */
        List<Integer> lengths = lists.stream().map(String::length).collect(Collectors.toList());
        System.out.println("list of lengths: " + lengths);

        /*
         * mapToInt() : makes specialized IntStream i.e. ToIntFunction<T>
         * no collect() in specialized streams, instead we can use summaryStatics()
         */
        IntSummaryStatistics summaryStatistics = lists.stream().mapToInt(String::length).summaryStatistics();
        System.out.println("summary statistics: " + summaryStatistics);
    }
}
