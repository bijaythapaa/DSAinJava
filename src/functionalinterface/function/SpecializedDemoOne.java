package functionalinterface.function;

import java.util.function.Function;

public class SpecializedDemoOne {
    public static void main(String[] args) {
//        Function<String, Integer> function = s -> s.length();
        Function<String, Integer> function = String::length;
        String word = "could you please tell me my length !?";
        System.out.println("well, your length is: " + function.apply(word));
    }
}
