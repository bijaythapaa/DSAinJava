package locale;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatParseDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, Month.MARCH, 3);
        Locale locale = new Locale("en", "GB");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE dd MM yyyy", locale);
        String result = date.format(format);
        System.out.println(result);

        /* this line gave exception:
         * java.time.format.DateTimeParseException: Text 'Tuesday 31 March 2020' could not be parsed
         */
//        date = LocalDate.parse("Wednesday 03 Mar 2021");
        LocalDateTime localDateTime = LocalDateTime.parse("Wednesday 03 Mar 2021", format);
        locale = new Locale("ru");
        format = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(locale);
        result = date.format(format);
        System.out.println(result);
    }
}
