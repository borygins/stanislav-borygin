package com.ifmo.lesson28;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class NewYear {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ny = LocalDateTime.of(2020, 1, 1, 0, 0);
//            Duration duration = Duration.between(now,ny);
            long day = Duration.between(now, ny).toDays();
            long h = Duration.between(now, ny).minus(Duration.ofDays(day)).toHours();
            long min = Duration.between(now, ny).minus(Duration.ofDays(day)).minus(Duration.ofHours(h)).toMinutes();
            long sec = Duration.between(now, ny).minus(Duration.ofDays(day)).minus(Duration.ofHours(h)).minus(Duration.ofMinutes(min)).toSeconds();

            System.out.println("До НГ осталось: " + day + " дней " + h + " часов " + min + " минут " + sec + " секунд");

            Thread.sleep(1000);
        }
    }

}
