package collections.storingincollection;

import java.util.ArrayList;
import java.util.Collection;

public class HandleSingleDataDemo {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        System.out.println(strings);
        strings.remove("one");
        System.out.println(strings);
        if (strings.contains("one")){
            System.out.println("one is in list");
        }
        if (!strings.contains("one")){
            System.out.println("one is not here");
        }
    }
}
