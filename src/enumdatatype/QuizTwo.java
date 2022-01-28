package enumdatatype;

enum Size {
    SMALL,
    MEDIUM,
    LARGE
}

public class QuizTwo {
    public static void main(String[] args) {
        final var size = Size.SMALL;
        switch (size) {
            case SMALL: {
                System.out.println(size);
            }
        }
    }
}
