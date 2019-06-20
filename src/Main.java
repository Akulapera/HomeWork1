import java.time.LocalDateTime;

import org.testng.Assert;
import org.testng.annotations.Test;

    public class Main {

        @Test
        public void  formatDatesTest(){
            DatesTool.setCurrentDate(2018,03,18,11, 55, 20);
            LocalDateTime resDate;
             resDate=LocalDateTime.now();
            System.out.println("Now is " +resDate);

            resDate= DatesTool.addHoursToNow(1);
            System.out.println("addHoursToNow " + resDate);

            resDate= DatesTool.addMinutesToNow(5);
            System.out.println("addMinutesToNow " + resDate);

            resDate= DatesTool.addDaysToNow(30);
            System.out.println("addDaysToNow " + resDate);
        }
        @Test
        public  void  DatesToolAddTest(){
            DatesTool.setCurrentDate(2018,06,18,11, 55, 20);
            assertEqualsDate(LocalDateTime.of(2018,03,18,12, 55, 20),
                    DatesTool.addHoursToNow(1));
        }

        @Test
        public void DatesToolCompairToTest(){
           LocalDateTime first= LocalDateTime.of(2019,8,18,12, 55, 20);
           LocalDateTime second=LocalDateTime.of(2019,07,10,14, 11, 07);
            LocalDateTime third=LocalDateTime.of(2019,07,10,14, 11, 07);
           assertEqualsDate(DatesTool.getDatesOrder(first, second,true),third);
        }

        public static  void assertEqualsDate (LocalDateTime firstDate, LocalDateTime secondDate){
            Assert.assertEquals(firstDate.getYear(), secondDate.getYear());
            Assert.assertEquals(firstDate.getMonthValue(), secondDate.getMonthValue());
            Assert.assertEquals(firstDate.getDayOfMonth(), secondDate.getDayOfMonth());
            Assert.assertEquals(firstDate.getHour(), secondDate.getHour());
            Assert.assertEquals(firstDate.getMinute(), secondDate.getMinute());
            Assert.assertEquals(firstDate.getSecond(), secondDate.getSecond());
        }

    }


