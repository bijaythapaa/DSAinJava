package functionalinterface.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerToAnIterable {

    /*
     * Several important methods have been added to the interfaces of Collection framework.
     * One of them takes a Consumer<T> as an argument and is Extremely useful:
     * Iterable.forEach()
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Amar");
        list.add("Damar");
        list.add("Ramesh");
        Consumer<String> consumer = s -> System.out.println(s);
//        Consumer<String> consumer = System.out::println;
        list.forEach(consumer);

        /*
        * This forEach() method exposes a way to access an internal iteration over all the elements of any Iterable,
        * passing the action you need to take on each of these elements.
        * This is very powerful way of doing so and makes code more readable.
        */

    }
}
