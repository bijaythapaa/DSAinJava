package immutables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : bijay.thapa
 * @created : 6/10/23, Saturday
 * @Description : Immutable Collections
 **/
public class ImmutableCryptoList {
    public static void main(String[] args) {
        List<String> cryptoList = new ArrayList<>();
        Collections.addAll(cryptoList, "BTC", "ETH", "USDT", "USDC", "BNB");

        /* Immutable Collections */
        List immutableCryptoList = List.copyOf(cryptoList);
        System.out.println("Underlying crypto list = " + cryptoList);
        System.out.println("Immutable crypto list = " + immutableCryptoList);

        // try to add one more cryptocurrency to modifiable list and show immutable does not display change
        cryptoList.add("BUSD");
        System.out.println("New underlying list:" + cryptoList);
        System.out.println("New immutable crypto List:" + immutableCryptoList);

        // try to add one more cryptocurrency to unmodifiable list and show in unmodifiable list
        try {
            immutableCryptoList.add("XRP");
        } catch (UnsupportedOperationException exc) {
            System.out.println("Exception: " + exc);
            System.out.println("New immutable crypto List with new element:" + immutableCryptoList);
        }
    }
}
