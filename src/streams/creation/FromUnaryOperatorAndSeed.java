package streams.creation;

import java.util.stream.Stream;

public class FromUnaryOperatorAndSeed {
    public static void main(String[] args) {
        Stream<String> iterated = Stream.iterate("+", s -> s + "+");
        iterated.limit(5L).forEach(System.out::println);

        /* after java 9, this pattern has an overload, which takes a predicate as an argument */
        Stream<String> againIterated = Stream.iterate("+", s -> s.length() <= 5, s -> s + "+");
        againIterated.forEach(System.out::println);
    }
}
