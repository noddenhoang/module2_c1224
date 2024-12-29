package local_date_util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String dateString1 = "18/10/2003";
        String dateString2 = "2024/10/18";

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate date1 = LocalDate.parse(dateString1, formatter1);
        LocalDate date2 = LocalDate.parse(dateString2, formatter2);

        System.out.println("Từ chuỗi dd/MM/yyyy: " + dateString1 + " => LocalDate: " + date1);
        System.out.println("Từ chuỗi yyyy/MM/dd: " + dateString2 + " => LocalDate: " + date2);

        LocalDate currentDate = LocalDate.now();

        String formattedDate1 = currentDate.format(formatter1);
        String formattedDate2 = currentDate.format(formatter2);

        System.out.println("Ngày hiện tại (định dạng dd/MM/yyyy): " + formattedDate1);
        System.out.println("Ngày hiện tại (định dạng yyyy/MM/dd): " + formattedDate2);
    }
}
