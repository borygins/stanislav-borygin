package com.ifmo.lesson23;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopWordsFuture {
    public static void main(String[] args) throws IOException {
        // Создаем файл, указывая путь к текстовому файлу на диске
        File text = new File("C:\\wap.txt");

        // Вычитываем все строки из файла
        List<String> lines = Files.readAllLines(text.toPath());

        // Создаем пустую коллекцию для слов.
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            // Для каждой строки
            String[] wordSplit =
                    line.toLowerCase() // Переводим в нижний регистр
                            .replaceAll("\\p{Punct}", " ") // Заменяем все знаки на пробел
                            .trim() // Убираем пробелы в начале и конце строки.
                            .split("\\s"); // Разбиваем строки на слова

            for (String s : wordSplit) {
                // Выбираем только непустые слова.
                if (s.length() > 0)
                    words.add(s.trim());
            }
        }

        System.out.println(top10Words(words));
        System.out.println(top10Phrases(words));
        System.out.println(charactersFrequency(words));
    }

    public static Map<String, Integer> top10Words(List<String> words) {
        // todo implement
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        for (String word : words) {
            Integer cnt = map.get(word);
            if (cnt == null) {
                map.put(word, 1);
            } else {
                map.put(word, cnt + 1);
            }
            i++;
        }
        // System.out.println(i);

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(System.out::println);
//        int j =0;
//                for (Map.Entry<String, Integer> top : map.entrySet()) {
//                    map.entrySet().stream()
//                            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                            .forEach( System.out::println);
//
//                    //System.out.println(top);
//                    if (j>10) {
//                        break;
//                    }
//                    j++;
//                }
//        for (int j = 0; j < ; j++) {
//
//            for (Map.Entry<String, Integer> top : map.entrySet()){
//
//            }
//        }

        return Map.of();
    }



    public static Map<String, Integer> top10Phrases(List<String> words) {
        // todo implement
        return Map.of();
    }

    public static Map<Character, Integer> charactersFrequency(List<String> words) {
        // todo implement
        return Map.of();
    }
}
