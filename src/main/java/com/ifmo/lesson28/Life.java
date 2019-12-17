package com.ifmo.lesson28;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Life {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime bd = LocalDateTime.of(1987,3,19,2,45);

        long seconds = Duration.between(bd, now).toSeconds();

        System.out.println(seconds);

    }
}
