package functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        Random random = new Random(314L);
        Supplier<Integer> newSupplier = () -> random.nextInt(10);
        for (int index = 0; index < 5; index++) {
            // This lambda is capturing a variable from enclosing scope: random,
            // making this variable 'effectively final'
            System.out.println(newSupplier.get());
        }
    }
}
