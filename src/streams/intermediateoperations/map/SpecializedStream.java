package streams.intermediateoperations.map;

import java.util.IntSummaryStatistics;
import java.util.List;

public class SpecializedStream {
    public static void main(String[] args) {
        List<String> lists = List.of("one", "two", "three", "four", "five");
        IntSummaryStatistics statistics = lists.stream().mapToInt(String::length).summaryStatistics();
        System.out.println("summary statistics: "+statistics);
        System.out.println("summary statistics Sum: "+statistics.getSum());
        System.out.println("summary statistics Average: "+statistics.getAverage());
        System.out.println("summary statistics Max: "+statistics.getMax());

    }
}
