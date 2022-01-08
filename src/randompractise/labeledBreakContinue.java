package randompractise;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 1/8/22 - 8:51 PM
 */
public class labeledBreakContinue {

    /*
     * Trick: Labeled breaks and continues
     * can give "break" a label to break-out of an appropriately labeled outer loop as well.
     * can do likewise with "continue": skips the rest of the current iteration of the innermost loop
     * because if you pass it a label, it will skip the iteration of the labeled loop instead.
     *
     * However, just because you can, doesn't mean you should. Use this trick with care !!
     * */

    public static void main(String[] args) {
        String searchMe = "Look for substring in me";
        String subString = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - subString.length();

        test:
            for (int i = 0; i <= max; i++) {
                int n = subString.length();
                int j = i;
                int k = 0;
                while (n-- != 0) {
                    if (searchMe.charAt(j++) != subString.charAt(k++)) {
                        continue test;
                    }
                }
                foundIt = true;
                    break test;
            }
            System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}
