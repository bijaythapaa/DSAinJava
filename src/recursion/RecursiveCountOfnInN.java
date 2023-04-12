package recursion;

/**
 * @author : bijay.thapa
 * @created : 4/12/23, Wednesday
 * @Description :
 **/
public class RecursiveCountOfnInN {
    private static int counter = 0;

    public static void main(String[] args) {
        System.out.println("No of 0's in the number is: " + countOfn(1202900099));
        System.out.println("No of 0's in the number is: " + countOfnEasy(1202900099));
        System.out.println("No of 0's in the number is: " + countOfnEasy(1202900099, 0));
    }

    private static int countOfn(int num) {
        if (num % 10 == num) return counter;
        counter = num % 10 == 0 ? counter + 1 : counter;
        return countOfn(num / 10);
    }

    private static int countOfnEasy(int num, int counter) {
        if (num == 0) return counter;
        counter = num % 10 == 0 ? counter + 1 : counter;
        return countOfnEasy(num / 10, counter);
    }

    private static int countOfnEasy(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int counter) {
        if (num == 0) return counter;
        counter = num % 10 == 0 ? counter + 1 : counter;
        return helper(num / 10, counter);
    }
}
