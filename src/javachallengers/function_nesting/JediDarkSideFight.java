package javachallengers.function_nesting;

import java.util.function.*;

/**
 * @author : bijay.thapa
 * @created : 4/10/23, Monday
 * @Description :
 **/
public class JediDarkSideFight {
    public static void main(String[] args) {
        String luke = "useSaber";
        Supplier<String> yoda = () -> "useForce";

        UnaryOperator<String> fightEmpire = luke::concat;
        UnaryOperator<String> fightDarkSide = String::toUpperCase;

        BiFunction<UnaryOperator<String>, UnaryOperator<String>, Function<String, String>> attackDarkSide = Function::andThen;
        System.out.println(fightDarkSide.apply(fightEmpire.apply(yoda.get())));
        String finalAttack = attackDarkSide.apply(fightEmpire, fightDarkSide).apply(yoda.get());

        Consumer<String> consumeForce = System.out::println;
        consumeForce.accept(finalAttack);
    }
}
