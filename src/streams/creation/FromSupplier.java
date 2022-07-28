package streams.creation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FromSupplier {
    public static void main(String[] args) {
        /* stackoverflow */
//        Stream<String> generated = Stream.generate(() -> "+");
//        List<String> strings = generated.collect(Collectors.toList());

        Stream<String> generated = Stream.generate(() -> "+");
        List<String> strings = generated.limit(10L).collect(Collectors.toList());
        System.out.println("strings: " + strings);
    }
}
