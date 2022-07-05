package collections.sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four", "five", "six");
        Set<String> set = new HashSet<>();
        set.addAll(strings);
        set.forEach(System.out::println);
    }
}
