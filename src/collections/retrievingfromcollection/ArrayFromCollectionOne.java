package collections.retrievingfromcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.IntFunction;

public class ArrayFromCollectionOne {
    public static void main(String[] args) {
//        Collection<String> strings = List.of("one", "two", "three", "four", "five");
//
//        String[] tabStringOne = strings.toArray(new String[]{});
//        System.out.println("tabStringOne: " + Arrays.toString(tabStringOne));
//        String[] tabStringTwo = strings.toArray(new String[2]);
//        System.out.println("tabStringTwo: " + Arrays.toString(tabStringTwo));

        Collection<String> strings = List.of("one", "two");


        String[] largerTab = {"three", "three", "three", "I", "was", "there"};
        System.out.println("largerTab: " + Arrays.toString(largerTab));

        String[] result = strings.toArray(largerTab);
        System.out.println("result: " + Arrays.toString(result));

        String[] zeroLengthTab = {};
        result = strings.toArray(zeroLengthTab);
        System.out.println("zeroLengthTab: " + Arrays.toString(zeroLengthTab));
        System.out.println("result: " + Arrays.toString(result));

        String[] tabStringThree = strings.toArray(String[]::new);
        System.out.println("tabStringThree: " + Arrays.toString(tabStringThree));
    }
}
