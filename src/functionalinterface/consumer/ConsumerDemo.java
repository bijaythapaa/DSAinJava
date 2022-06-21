package functionalinterface.consumer;

import java.util.Random;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
//        Consumer<String> consumer = System.out::println;
        consumer.accept("Where are you talking from? ");

        Random random = new Random(314L);
        for (int i = 0; i < 5; i++) {
            int nextRandom = random.nextInt(50);
            consumer.accept("next random: " +  nextRandom);
        }
    }
}
