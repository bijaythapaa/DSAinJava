package functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() == 3;
        String word = "Hello from the Predicate";
        boolean isOfLengthThree = predicate.test(word);
        System.out.println("Is the word of length Three? " + isOfLengthThree);
    }
}
