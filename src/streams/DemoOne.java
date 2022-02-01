package streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 2/1/22 - 9:04 PM
 */
public class DemoOne {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        stream = Stream.of("a", "b", "c");
    }
}
