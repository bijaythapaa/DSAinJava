package remember;

import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greetings = sc.nextLine();
        String goodBye = sc.nextLine();
        System.out.println(greetings);
        System.out.println(goodBye);
    }
}
