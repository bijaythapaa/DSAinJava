package functionalinterface.function;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    /*BiFunction<T, U, R> : T, U are arguments and R is a return type*/

    public static void main(String[] args) {
        BiFunction<String, String, Integer> findWordInSentence = (word, sentence) -> sentence.indexOf(word);
        String word = "mind";
        String sentence = "Where is my mind";
        System.out.println("where is the word '"+word+"' in the sentence '"+sentence+"'? \n Ans: "
        +findWordInSentence.apply(word, sentence));
    }

    /*The UnaryOperator<T> interface has also a siblings interface with two arguments:
    * BinaryOperator<T> that extends BiFunctions<T, U, R>
    * so, the basic arithmetic operations can be modeled with a BinaryOperator<T>.
    */

    /* A subset of all possible specialized versions of bi-function has been added
    *
    * - IntBinaryOperator
    * - LongBinaryOperator
    * - DoubleBinaryOperator
    *
    * - ToIntBiFunction<T>
    * - ToLongBiFunction<T>
    * - ToDoubleFunction<T>
    */
}
