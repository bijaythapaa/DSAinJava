package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

class User {
    private int identityNumber;
    private String name;

    public User(int identityNumber, String name) {
        this.identityNumber = identityNumber;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getIdentityNumber() {
        return this.identityNumber;
    }
}

public class UnboundDemo {
    /* Method that do not take any Argument */

    /*
    syntax : RefType:instanceMethod,
    where RefType is the name of a type, and instanceMethod is the name of an instance method.
    */
    public static void main(String[] args) {
        // Suppose you have the following code
        // Function<String, Integer> function = s -> s.length();

         /*
         Above function (which could be written as a ToIntFunction<T>)
         is just a reference to method length() of class String.
         */
        Function<String, Integer> function = String::length;
        System.out.println("Length of string is: " + function.apply("uncomfortable"));

        /*
        You can call any getter from a plain Java bean with such a method reference.
        Suppose you have User class with a getName() defined on it.
        */
        List<User> users = Arrays.asList(new User(1234, "ram"), new User(5678, "shyam"));
//        Function<User, String> getName = user -> user.getName();
        Function<User, String> getName = User::getName;
        for (User user : users) {
            System.out.println("User name is: " + getName.apply(user));
        }

//        BiFunction<String, String, Integer> biFunction = (sentence, word) -> sentence.indexOf(word);
        BiFunction<String, String, Integer> biFunction = String::indexOf;
        System.out.println("index of the word in a Sentence is: " +
                biFunction.apply("The hallway smelt of boiled cabbage and old rag mats", "cabbage"));
    }
}
