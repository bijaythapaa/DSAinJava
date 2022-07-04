package collections.iteratingovercollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class AccessingListOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "1", "2", "3", "4", "6", "5", "7"));
        System.out.println(list);
//        System.out.println(list.subList(1, 5));
        list.subList(1, 5).clear();
        // .clear() method sub-listed the main 'list' object/
        System.out.println(list);

        list.sort(String::compareTo);
        System.out.println(list);

        // Iterating with ListIterator
        for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); ) {
            String nextElement = listIterator.next();
            if (Objects.equals(nextElement, "5")) {
                listIterator.set("55");
            }
        }
        System.out.println("lists: " + list);
    }
}
