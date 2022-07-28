package streams.creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FromVarArgsAndArray {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 4, 6, 7, 9);
        List<Integer> integers = stream.collect(Collectors.toList());
        System.out.println("ints: " + integers);

        String[] strings = {"one", "two", "three", "four", "five", "six", "seven"};
        Stream<String> stringStream = Arrays.stream(strings);
        List<String> list = stringStream.collect(Collectors.toList());
        System.out.println("strings: " + list);
    }
}
