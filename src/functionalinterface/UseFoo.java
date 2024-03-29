package functionalinterface;

import java.util.function.Function;

public class UseFoo {
//    public String add(String string, Foo foo) {
//        return foo.method(string);
//    }

    public String add(String string, Function<String, String> fn) {
        return fn.apply(string);
    }

    public static void main(String[] args) {
        UseFoo useFoo = new UseFoo();

//        Foo foo = parameter -> parameter + " from Lambda";
//        String result = useFoo.add("Message", foo);

        Function<String, String> function = parameter -> parameter + " from Lambda";
        System.out.println(function);
        System.out.println(useFoo.add("Message ", function));
        System.out.println(function.apply("Message again"));

        // Instantiate Functional Interfaces with Lambda Expressions
//        Foo fooOne = parameter -> parameter + " from Foo";
        // over an inner class
//        Foo fooTwo = new Foo() {
//            @Override
//            public String method(String string) {
//                return string + " from Foo as inner class";
//            }
//        };
    }

    /*
    * if we look closer here, Foo is nothing more than a function that accepts one argument and produce a result.
    * Java8 already provides such an interface in Function<T,R> from `java.util.function` package.
    */

    // we can now remove our code and refactor it with predefined Interface from the package.

}
