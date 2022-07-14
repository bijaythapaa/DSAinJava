package streams.intermediateoperations.filter;

import java.util.List;

public class DemoOne {
    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four", "five");
        long count = strings.stream().map(String::length).filter(integer -> integer == 3).count();
        System.out.println("count: " + count);
    }
}
