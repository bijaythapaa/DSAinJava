package streams.intermediateoperations.limitandskip;

import java.util.List;
import java.util.stream.Collectors;

public class DemoOne {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = ints.stream().skip(2).limit(5).collect(Collectors.toList());
        System.out.println("Resulting list: " + result);
    }
}
