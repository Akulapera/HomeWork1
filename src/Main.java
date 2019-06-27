import java.time.LocalDateTime;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class Main {

        static LocalDateTime dateForConverting = LocalDateTime.of(2019, 6, 26, 20, 40, 55);


        @Test
        public void formatDatesTest() {
            DatesTool.setCurrentDate(2018, 03, 18, 11, 55, 20);
            LocalDateTime resDate;
            resDate = LocalDateTime.now();
            System.out.println("Now is " + resDate);

            resDate = DatesTool.addHoursToNow(1);
            System.out.println("addHoursToNow " + resDate);

            resDate = DatesTool.addMinutesToNow(5);
            System.out.println("addMinutesToNow " + resDate);

            resDate = DatesTool.addDaysToNow(30);
            System.out.println("addDaysToNow " + resDate);
        }

        @Test
        public void DatesToolAddTest() {
            DatesTool.setCurrentDate(2018, 06, 18, 11, 55, 20);
            assertEqualsDate(LocalDateTime.of(2018, 06, 18, 12, 55, 20),
                    DatesTool.addHoursToNow(1));
        }

        @Test
        public void DatesToolCompairToTest() {
            LocalDateTime first = LocalDateTime.of(2019, 8, 18, 12, 55, 20);
            LocalDateTime second = LocalDateTime.of(2019, 07, 10, 14, 11, 07);
            LocalDateTime third = LocalDateTime.of(2019, 07, 10, 14, 11, 07);
            assertEqualsDate(DatesTool.getDatesOrder(first, second, true), third);
        }

        private static void assertEqualsDate(LocalDateTime firstDate, LocalDateTime secondDate) {
            Assert.assertEquals(firstDate.getYear(), secondDate.getYear());
            Assert.assertEquals(firstDate.getMonthValue(), secondDate.getMonthValue());
            Assert.assertEquals(firstDate.getDayOfMonth(), secondDate.getDayOfMonth());
            Assert.assertEquals(firstDate.getHour(), secondDate.getHour());
            Assert.assertEquals(firstDate.getMinute(), secondDate.getMinute());
            Assert.assertEquals(firstDate.getSecond(), secondDate.getSecond());
        }

        @Test
        public static void convertingLocalDateTimeToStringTest() {
            String result = DatesTool.LocalDateTimeToString(dateForConverting);
            //System.out.println(" string is " + result); - for checking this line
            Assert.assertEquals(result, "2019-06-26 20:40:55");
            Assert.assertNotEquals(result,"2000-06-26 20:40:55");
        }
        @Test
        public static void convertStringToLocalDateTimeTest(){
          LocalDateTime result=DatesTool.convertStringToLocalDateTime("2019-06-26 20:40:55");
          Assert.assertTrue(result.isEqual(dateForConverting));
          Assert.assertFalse(result.isEqual(dateForConverting.plusHours(4)));

    }

    }





