package functionalinterface.predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (word, length) -> word.length() == length;
        String word = "AnimalFarm";
        int length = 10;
        System.out.println("is the length of word equals to given length? " + biPredicate.test(word, length));
    }
}
