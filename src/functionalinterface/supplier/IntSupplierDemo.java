package functionalinterface.supplier;

import java.util.Random;
import java.util.function.IntSupplier;

public class IntSupplierDemo {
    /*
     * In SupplierDemo class, we had supplied Integer to Supplier interface as Supplier<Integer>
     * so, in the code there's two operations happening under the hood i.e. auto-boxing and auto-unboxing.
     * - the int returned by the Random.nextInt() is first boxed into an Integer, by the auto-boxing mechanism;
     * - this Integer is then unboxed when assigned to the nextRandom variable, by the auto-unboxing mechanism.
     */

    /*
    This boxing / unboxing does not come for free.
    Most of the time, this cost will be small compared to other things your application is doing,
    like getting data from a database or from a remote service.
    But in some cases, this cost may be not acceptable, and you need to avoid paying it.
    */

    // Good news is that JDK gives us IntSupplier interface for the solution.
    public static void main(String[] args) {
        Random random = new Random(314L);
        IntSupplier supplier = () -> random.nextInt(100);

        for (int index = 0; index < 5; index++) {
            int nextRandom = supplier.getAsInt();
            System.out.println("next Random: " + nextRandom);
        }
    }
}
