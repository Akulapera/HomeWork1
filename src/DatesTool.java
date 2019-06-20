import java.time.LocalDateTime;

    public class DatesTool {

        public static LocalDateTime currentDate= LocalDateTime.now();

        public  static  void setCurrentDate (int year, int month, int dayOfMonth, int hour, int minute, int second){
            currentDate=LocalDateTime.of(year, month, dayOfMonth, hour,  minute, second);
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
    }


