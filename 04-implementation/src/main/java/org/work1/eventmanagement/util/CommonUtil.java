package org.work1.eventmanagement.util;

import java.sql.Time;
import java.time.*;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @author zoumy9
 * @date 2024-11-27
 **/
public class CommonUtil {
    public static LocalDate formatDate(String date) {
        return date == null ? LocalDate.now() : LocalDate.parse(date);
    }

    public static LocalTime formatTime(String date) {
        return date == null ? LocalTime.now() : LocalTime.parse(date);
    }

    public static Date locacalDateToDate(LocalDate localDate) {
        Instant instant = localDate.atTime(LocalTime.MIDNIGHT).atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        return date;
    }

    public static Time locacalTimeToTime(LocalDate localDateTime) {
        Time time = Time.valueOf(localDateTime.atStartOfDay().toLocalTime());
        return time;
    }

    public static int convertTimeToScale(String time) {
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        return hour * 60*60 + minutes*60;
    }


    public static boolean isNumeric(String str){
        return str != null && str.matches("-?\\d+(\\.\\d+)?");
    }
}
