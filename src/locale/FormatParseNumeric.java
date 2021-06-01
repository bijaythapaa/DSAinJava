package locale;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatParseNumeric {
    public static void main(String[] args) throws ParseException {
        BigDecimal price = BigDecimal.valueOf(2.99);
        Double tax = 0.2;
        int quantity = 123456789;
        Locale locale = new Locale("en", "GB");

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

        String formattedPrice = currencyFormat.format(price);
        String formattedTax = percentageFormat.format(tax);
        String formattedQuantity = numberFormat.format(quantity);
        System.out.println(formattedPrice + formattedTax + formattedQuantity);

        Locale locale1 = new Locale("en", "US");
        NumberFormat currFormat = NumberFormat.getCurrencyInstance(locale1);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale1);
        NumberFormat numFormat = NumberFormat.getNumberInstance(locale1);

/*        this line gives java.lang.ClassCastException:
        java.lang.Double cannot be cast to class java.math.BigDecimal   */
//        BigDecimal newPrice = (BigDecimal) currFormat.parse("$22.222");
        BigDecimal newPrice = BigDecimal.valueOf(currFormat.parse("$1.75").doubleValue());
        Double newTax = (Double) percentFormat.parse("88%");
        int newQuantity = numFormat.parse("123,456,789").intValue();
        System.out.println(newPrice + " : " + newTax + " : " + newQuantity);
    }
}
