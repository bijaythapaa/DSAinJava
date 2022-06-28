package collections.storingincollection;

import java.util.ArrayList;
import java.util.Collection;

public class HandleSelfDemo {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        if (!strings.isEmpty()) {
            System.out.println("Indeed string is not Empty");
        }
        System.out.println("length of strings is: " + strings.size());
        strings.clear();
        System.out.println("length of strings: " + strings.size());
    }
}
