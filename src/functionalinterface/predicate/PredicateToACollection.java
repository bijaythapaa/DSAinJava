package functionalinterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateToACollection {

    /*
    * One of the method added to Collection framework takes a predicate: removeIf()
    * This method uses this predicate to test each element in a collection.
    * if result is true then remove from collection.
    */

    public static void main(String[] args) {
        List<String> immutableStrings = List.of("one", "two", "three", "four", "five");
        List<String> strings = new ArrayList<>(immutableStrings);
        Predicate<String> isOddLength = s -> s.length() % 2 == 0;
        strings.removeIf(isOddLength);
        System.out.println("strings = " + strings);

        // calling removeIf() mutates this collection.

         /*
         should not call removeIf() on immutable collection, like the one produced by List.of() factory methods.
         will get exception since data of immutable collection can not be removed.
         */

        /*
        Arrays.asList() produces a collection that behaves like an Array.
        You can mutate its existing elements, but not allowed to add/remove elements from the list returned by this
        factory method.
        */
    }
}
