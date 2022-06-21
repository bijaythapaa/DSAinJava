package functionalinterface.predicate;

import java.util.function.IntPredicate;

public class IntPredicateDemo {
    public static void main(String[] args) {
        IntPredicate predicate = s -> s >10;
        System.out.println(predicate.test(10));
    }
}
