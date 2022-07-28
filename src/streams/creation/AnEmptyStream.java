package streams.creation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnEmptyStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        List<String> strings = stream.collect(Collectors.toList());
        System.out.println("strings: " + strings);
    }
}
