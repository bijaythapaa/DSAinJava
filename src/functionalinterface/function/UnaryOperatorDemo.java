package functionalinterface.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    /* extends Function<T,U>
    * This unary operator concept is used to name the functions that take an argument of a given type and
    * return a result of same type.
    *
    * All the classical math operations can be modeled by UnaryOperator<T> :
    * the square root, trigonometry operators, logarithm and the exponential.
    */

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("amar", "damar", "hamar");
//        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        UnaryOperator<String> unaryOperator = String::toUpperCase;
        strings.replaceAll(unaryOperator);
        System.out.println(strings);
    }
}
