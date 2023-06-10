package immutables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : bijay.thapa
 * @created : 6/10/23, Saturday
 * @Description : Modifiable Collections
 **/
public class UnmodifiableCryptoList {
    public static void main(String[] args) {
        List<String> cryptoList = new ArrayList<>();
        Collections.addAll(cryptoList, "BTC", "ETH", "USDT", "USDC", "BNB");

        /* Unmodifiable Collections */
        List<String> unmodifiableCryptoList = Collections.unmodifiableList(cryptoList);
        System.out.println("unmodifiableCryptoList = " + unmodifiableCryptoList);

        // try to add one more cryptocurrency in modifiable list and show in unmodifiable list
        cryptoList.add("BUSD");
        System.out.println("New unmodifiableCryptoList with new element = " + unmodifiableCryptoList);

        // try to add one more cryptocurrency to unmodifiable list and show in unmodifiable list,
        // unmodifiableCryptoList.add would throw an uncaught exception and the println would not run.
        try {
            unmodifiableCryptoList.add("XRP");
        } catch (UnsupportedOperationException exc) {
            System.out.println("Exception = " + exc);
            System.out.println("New unmodifiableCryptoList with new element = " + unmodifiableCryptoList);
        }
    }
}
