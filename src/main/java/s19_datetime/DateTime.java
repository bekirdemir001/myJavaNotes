package s19_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        Date myDate = new Date();
        System.out.println(myDate);//Sat Dec 23 10:35:14 TRT 2023

        //How to take in the present moment?
        System.out.println(LocalDate.now());//2023-12-23
        System.out.println(LocalTime.now());//10:35:14.401261800
        System.out.println(LocalDateTime.now());//2023-12-23T10:35:14.401261800

        //How do we get the time in any time zone in the world?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));//2023-12-23T08:35:14.404261500
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-12-23T16:35:14.406261700

        //How to go to the next date?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2031-06-27

        //How to get to old date?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2019-09-21

        //How to go to the next time?
        System.out.println(LocalTime.now().plusHours(3));//13:35:14.406261700

        //How to get to old time?
        System.out.println(LocalTime.now().minusMinutes(45));//09:50:14.406261700

        //How to get a particular part of time?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//10:35

        //How to get a particular part of Data?
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth());//12:23

        //How to compare two Dates?
        // 02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005, 2, 13).isBefore(LocalDate.of(2007, 3, 1));
        System.out.println(result);//true
        boolean result2 = LocalDate.of(2005, 2, 13).isAfter(LocalDate.of(2007, 3, 1));
        System.out.println(result2);//false

        //How to change the format of Dates?
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now()));//   23/12/2023
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(dtf2.format(LocalDate.now()));//   23/Ara/2023
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dtf3.format(LocalDate.now()));//   23/Aralık/2023

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/M/yyyy");
        System.out.println(dtf4.format(LocalDate.now()));//   23/12/2023
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("d/MM/yyyy");//(Makes the day double digits.)
        System.out.println(dtf5.format(LocalDate.now()));//   23/12/2023
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(dtf6.format(LocalDate.now()));//   23/12/23

        //How to change the format of Times?
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//10:52:07.504455200

        //"hh" is used 12-hour clock system. "HH" is used 24-hour clock system.
        //When hh is used, it should be said "AM" or "PM", just write "a" to say this. That is, "hh:mm:ss a"
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(dtf7.format(myTime));//10:52:07 ÖÖ
    }

}