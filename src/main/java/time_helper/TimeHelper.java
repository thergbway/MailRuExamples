package time_helper;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeHelper {
    public static long getTimeInMS() {
        return new Date().getTime();
    }

    public static long getPOSIX() {
        final long MILLIS_IN_SEC = 1000L;
        return new Date().getTime() / MILLIS_IN_SEC;
    }

    public static String getUserDateFull(Locale locale) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);

        return dateFormat.format(date);
    }
}
