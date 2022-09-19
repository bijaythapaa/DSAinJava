package streams.creation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FromRangeOfNumbers {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E"};
        // IntStream.rangeClosed() to consider upper bound as well.
        List<String> listOfLetters = IntStream.range(0, 10)
                .mapToObj(index -> letters[index % letters.length])
                .collect(Collectors.toList());
        System.out.println("List of Letters: " + listOfLetters);
    }
}
