package array;

import java.util.Scanner;

public class testing {

    public int fibonacci(int x) {
        if (x < 2) {
            return 1;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of fibonacci series you wanna print: ");
        int x = sc.nextInt();
        testing test = new testing();
        while (x>0){
            System.out.print(test.fibonacci(x)+", ");
            x--;
        };

//        String x = "bijay";
//        x = x.concat("thapa");
//        System.out.println(x);
//        System.out.println(x.length());
    }
}
