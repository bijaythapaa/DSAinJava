package locale;

import java.util.Locale;

public class DemoOne {
    public static void main(String[] args) {

        Locale uk1 = new Locale("en", "GB");
        Locale uk2 = new Locale("en", "GB", "EURO");
        System.out.println(uk1 + " : " + uk2);

        Locale us = new Locale("en", "US");
        Locale fr1 = new Locale("en", "US");
        Locale cf = new Locale("en", "US");
        Locale fr2 = new Locale("en", "US");
        Locale es = new Locale("en", "US");
        System.out.println(us + " : " + fr1 + " : " + fr2 + " : " + cf + " : " + es);

        Locale current = Locale.getDefault();
        System.out.println("default: "+current);

        Locale th = Locale.forLanguageTag("th-TH-u-ca-buddhist-nu-thai");


    }
}
