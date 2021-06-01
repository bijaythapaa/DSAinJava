package datetimezoned;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DemoOne {

    public static void main(String[] args) {
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId la = ZoneId.of("America/Los_Angeles");
        System.out.println(london + " : " + la);

        ZoneId zoneIdOne = ZoneId.of("GMT+2");
        ZoneId zoneIdTwo = ZoneId.of("UTC-05:00");
        ZoneId systemId = ZoneId.systemDefault();
        System.out.println(zoneIdOne+" : "+ zoneIdTwo+" + "+systemId);

        LocalDateTime someTime = LocalDateTime.of(2019, Month.MARCH, 3, 21, 8, 55);
        ZonedDateTime londonTime = ZonedDateTime.of(someTime, london);
        ZonedDateTime laTime = londonTime.withZoneSameInstant(la);
        System.out.println(someTime+ " : "+londonTime+" + "+laTime);

    }

}
