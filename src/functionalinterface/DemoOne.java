package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Product {
    private int price;
    private String key;

    private Product(int price, String key) {
        this.price = price;
        this.key = key;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    private static void calculateTotalPrice(List<Product> products) {
//        int totalPrice = 0;

        // Lambdas cannot modify variables defined outside their body.
        // They can read them, as long as, they are final i.e. immutable.
        // This process of accessing variable is called "capturing": labmdas cannot capture variables, they capture
        // only values. A final variable is in fact a value.

        /*You have noted that the error message tells us that the variable can be final,
        which is a classical concept in the Java language. It also tells us that the variable can be effectively final.
        This notion was introduced in Java SE 8: even if you do not explicitly declare a variable final,
        the compiler may do it for you. If it sees that this variable is read from a lambda,
        and that you do not modify it, then it will nicely add the final declaration for you.
        Of course this is done in the compiled code, the compiler does not modify your source code.
        Such variables are not called final; they are called effectively final variables.
        This is a very useful feature.*/

//        Consumer<Product> consumer = product -> totalPrice[0] += product.getPrice();
//        for (Product product : products) {
//            consumer.accept(product);
//        }
    }


    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(35, "val"));
        list.add(new Product(55, "val2"));
        calculateTotalPrice(list);
    }
}

public class DemoOne {
     static List<String> retainStringsOfLengthThree(List<String> strings) {
        Predicate<String> stringPredicate = s -> s.length() == 3;
        List<String> stringsOfLengthThree = new ArrayList<>();
        for (String s : strings) {
            if (stringPredicate.test(s)) {
                stringsOfLengthThree.add(s);
            }
        }
        return stringsOfLengthThree;
    }

    public static void main(String[] args) {
        // lambda that implements Predicate<String>
        Predicate<String> predicate = s -> s.length() == 3;
//        System.out.println(predicate.test("ram"));


        // implementing Consumer<String>
//        Consumer<String> consumer = s -> System.out.println(s);
        Consumer<String> consumer = System.out::println;
        consumer.accept("still confused about which method to use after creating lambda !!");

        // implementing Runnable
        Runnable runnable = () -> System.out.println("Run forest, Run !!");
        runnable.run();
    }
}
