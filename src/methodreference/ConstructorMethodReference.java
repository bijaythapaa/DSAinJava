package methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodReference {
    /*
    * A constructor is used instead of a method.
    * Syntax: ClassName::new
    */
    public static void main(String[] args) {
//        Supplier<List<Integer>> supplier = () -> new ArrayList<>();
        Supplier<List<Integer>> supplier = ArrayList::new;
        System.out.println("give me a new ArrayList: " + supplier.get());

        /* Be aware: if you do-not know the type of method reference, then you can not tell what it does actually */
//        Supplier<List<String>> listSupplier = () -> new ArrayList<>();
        Supplier<List<String>> listSupplier = ArrayList::new;
//        Function<Integer, List<Integer>> listFunction = size -> new ArrayList<>(size);
        Function<Integer, List<Integer>> listFunction = ArrayList::new;
        /*
        Here, both variables listSupplier and listFunction, can be declared with ArrayList:: new as above.
        but, they do-not refer to the same constructor.
        So, be careful with that.
        */
    }
}
