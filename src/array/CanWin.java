package array;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/25/21 - 9:23 PM
 */

@FunctionalInterface  //It is optional
interface Drawable {
    public void draw();
}

public class CanWin {
    public static void main(String[] args) {
        int width = 10;

        //with lambda
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
