package com.ifmo.lesson22;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.lines;

public class TopWordsQueue {
    public static void main(String[] args) throws IOException {
        Object monitor = new Object();

        File text = new File("C:\\wap.txt");

        List<String> lines = Files.readAllLines(text.toPath());


        List<String> linesArr = new ArrayList<>();

        for (String line : lines) {
            // Для каждой строки
            String linesAll = line.toLowerCase() // Переводим в нижний регистр
                    .replaceAll("\\p{Punct}", " ") // Заменяем все знаки на пробел
                    .trim(); // Убираем пробелы в начале и конце строки.

//            String[] wordSplit =
//                    line.toLowerCase() // Переводим в нижний регистр
//                            .replaceAll("\\p{Punct}", " ") // Заменяем все знаки на пробел
//                            .trim() // Убираем пробелы в начале и конце строки.
//                            .split("\\s"); // Разбиваем строки на слова
//
//            for (String s : wordSplit) {
//                // Выбираем только непустые слова.
//                if (s.length() > 0)
//                    words.add(s.trim());
            }
        }
    }

    class Prod implements Runnable {

        @Override
        public void run() {


                   }
    }


