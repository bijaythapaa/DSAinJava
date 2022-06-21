package functionalinterface.consumer;

import java.util.Random;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
    // takes two arguments instead of one
    public static void main(String[] args) {
        BiConsumer<Random, Integer> biConsumer = ((random, integer) -> {
            for (int i = 0; i < integer; i++) {
                System.out.println("next random: "+ random.nextInt(50));
            }
        });
        biConsumer.accept(new Random(314L), 5);
    }
}
