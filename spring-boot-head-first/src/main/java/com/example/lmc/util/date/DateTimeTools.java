package com.example.lmc.util.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author lmc
 * @date 2020/8/2 16:39
 */
public class DateTimeTools {

    public static Date getDate() {
        // 获得 localDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        // 指定模式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // 将 LocalDateTime 格式化为字符串
        String format = localDateTime.format(dateTimeFormatter);
        // 获得 Instant
        Instant instant = Instant.ofEpochSecond(localDateTime.toEpochSecond(ZoneOffset.ofHours(8)));
        // 获得 Date
        Date date = Date.from(instant);

        return date;

    }

    public static String getDateToString() {
        // 获得 localDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        // 指定模式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // 将 LocalDateTime 格式化为字符串
        String format = localDateTime.format(dateTimeFormatter);

        return format;
    }

    public static Date getDateTime() {
        // 获得 localDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        // 指定模式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        // 将 LocalDateTime 格式化为字符串
        String format = localDateTime.format(dateTimeFormatter);
        // 获得 Instant
        Instant instant = Instant.ofEpochSecond(localDateTime.toEpochSecond(ZoneOffset.ofHours(8)));
        // 获得 Date
        Date date = Date.from(instant);

        return date;
    }

    public static String getDateTimeToString() {
        // 获得 localDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        // 指定模式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        // 将 LocalDateTime 格式化为字符串
        String format = localDateTime.format(dateTimeFormatter);

        return format;
    }
}
