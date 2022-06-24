package methodreference;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;

public class StaticDemo {
    /*
    Method Reference refers to a static method and is thus called a static method reference.
    syntax : RefType::staticMethod.
    */
    public static void main(String[] args) {
//        DoubleUnaryOperator sqrt = operand -> Math.sqrt(operand);
        DoubleUnaryOperator sqrt = Math::sqrt;
        System.out.println("SqRt is: "+sqrt.applyAsDouble(144));

//        IntBinaryOperator max = (left, right) -> Integer.max(left, right);
        IntBinaryOperator max = Integer::max;
        System.out.println("greater is: "+max.applyAsInt(111, 222));

    }
}
