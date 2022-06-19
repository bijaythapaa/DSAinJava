package functionalinterface;

@FunctionalInterface
public interface Baz {
    String method(String string);
    default String defaultBaz(){
        return "";
    }
    default String defaultCommon(){
        return "";
    }
}
