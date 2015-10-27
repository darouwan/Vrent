package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by darouwan on 2015/10/27.
 */
public class DateUtil {
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public static SimpleDateFormat getFormatter() {
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter;
    }

    public DateUtil() {
        formatter = new SimpleDateFormat("dd/MM/yyyy");
    }


    public static String format(Date date) {
        return formatter.format(date);
    }
}
