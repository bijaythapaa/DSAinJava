package collections.storingincollection;

import java.util.ArrayList;
import java.util.Collection;

public class HandleOtherCollectionDemo {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        Collection<String> first = new ArrayList<>();
        first.add("one");
        first.add("two");

        Collection<String> second = new ArrayList<>();
        second.add("one");
        second.add("four");

        System.out.println("Is first contained in strings? " + strings.containsAll(first));
        System.out.println("Is second contained in strings? " + strings.containsAll(second));

        Collection<String> toBeRemoved = new ArrayList<>();
        toBeRemoved.add("five");
        toBeRemoved.add("six");

        boolean hasChanged = strings.addAll(toBeRemoved);
        System.out.println("Has strings added: " + hasChanged);
        System.out.println("new strings is: " + strings);

        Collection<String> toBeRetained = new ArrayList<>();
        toBeRetained.add("one");
        toBeRetained.add("six");

        hasChanged = strings.retainAll(toBeRetained);
        System.out.println("Has strings added: " + hasChanged);
        System.out.println("new strings is: " + strings);
    }
}
