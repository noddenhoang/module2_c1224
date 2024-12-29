package local_date_util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {
    private final static DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final static DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static LocalDate parse_ddMMyyyy(String date) {
        return LocalDate.parse(date, formatter_ddMMyyyy);
    }

    public static LocalDate parse_yyyyMMdd(String date) {
        return LocalDate.parse(date, formatter_yyyyMMdd);
    }

    public static String format_ddMMyyyy(LocalDate date) {
        return date.format(formatter_ddMMyyyy);
    }

    public static String format_yyyyMMdd(LocalDate date) {
        return date.format(formatter_yyyyMMdd);
    }
}
