package recursion;

/**
 * @author : bijay.thapa
 * @created : 4/11/23, Tuesday
 * @Description :
 **/
public class RecursiveOneToN {
    public static void main(String[] args) {

        oneToN(5);
        oneToNRev(5);
        oneToNBothWay(5);
    }

    private static void concept(int limit) {
        if (limit == 0) return;
        System.out.println(limit);
//        n-- vs --n
//        concept(limit--);
        concept(--limit);
    }

    private static void oneToN(int limit) {
        if (limit == 0) return;
        System.out.println(limit);
        oneToN(limit - 1);
    }

    private static void oneToNRev(int limit) {
        if (limit == 0) return;
        oneToNRev(limit - 1);
        System.out.println(limit);
    }

    private static void oneToNBothWay(int limit) {
        if (limit == 0) return;
        System.out.println(limit);
        oneToNBothWay(limit - 1);
        System.out.println(limit);
    }
}
