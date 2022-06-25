package methodreference;

import java.util.function.Consumer;

public class BoundMethodReference {
    /*
    * The object on which the method is called is defined in the method reference itself.
    * So this call is bound to the object given in the method reference.
    */

    /*
    * Syntax: expression:instanceMethod
    * here, expression returns an object, and instanceMethod is an instance method of that expression object
    */

    public static void main(String[] args) {
//        Consumer<String> consumer = s -> System.out.println(s);
        Consumer<String> consumer = System.out::println;
        consumer.accept("The consumer is: Amar");
        // println() method is called on the System.out object, that is a part of method reference.
    }
}
