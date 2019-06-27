import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatesTool {

    public static LocalDateTime currentDate = LocalDateTime.now();

    public static void setCurrentDate(int year, int month, int dayOfMonth, int hour, int minute, int second) {
        currentDate = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);
    }

    public static LocalDateTime addHoursToNow(long hoursToAdd) {
        return currentDate.plusHours(hoursToAdd);
    }

    public static LocalDateTime addMinutesToNow(long minutesToAdd) {
        return currentDate.plusMinutes(minutesToAdd);
    }

    public static LocalDateTime addDaysToNow(long daysToAdd) {
        return currentDate.plusDays(daysToAdd);
    }

    public static LocalDateTime getDatesOrder(LocalDateTime date1, LocalDateTime date2, boolean isEarliest) {
        boolean isAscendingOrder = date1.isBefore(date2);
        if (isEarliest && isAscendingOrder || !isEarliest && !isAscendingOrder) {
            return date1;
        } else {
            return date2;
        }
    }

    public static String LocalDateTimeToString(LocalDateTime date) {

        final String DATE_FORMATTER = "yyyy-MM-dd HH:mm:ss";
        LocalDateTime localDateTime = LocalDateTime.of(2019, 6, 26, 20, 40, 55);

        //System.out.println("Current Time " + localDateTime);  - for checking this line

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        String formatDateTime = localDateTime.format(formatter);

        //System.out.println("Formatted Time: " +formatDateTime); - for checking this line
        return formatDateTime;
    }

    public static LocalDateTime convertStringToLocalDateTime(String stringDate) {
        String dateTime = "2019-06-26 20:40:55";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime formatDateTime = LocalDateTime.parse(dateTime, formatter);

        //System.out.println("Parsed Date : " + formatDateTime);
        return formatDateTime;
    }

}


