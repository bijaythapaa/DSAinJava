package functionalinterface;

@FunctionalInterface
public interface Bar {
    String method(String method);
    default String defaultBar() {
        return "";
    }
    default String defaultCommon() {
        return "";
    }
}
