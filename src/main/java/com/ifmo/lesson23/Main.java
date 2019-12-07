package com.ifmo.lesson23;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        int cpus = Runtime.getRuntime().availableProcessors();
        // Создём пул потоков.
        ExecutorService pool = Executors.newFixedThreadPool(cpus);

        File text = new File("C:\\wap.txt");

        List<String> lines = Files.readAllLines(text.toPath());

        List<List<String>> param = new ArrayList<>();

        for (int i = 0; i < cpus ; i++) {
            param.add(new ArrayList<>());

        }

        int count = 0;
        for (String line : lines){
            param.get(count++).add(line);

            if (count == cpus){
                count = 0;
            }
        }

        List<Future<Map<String, Integer>>> futures = new ArrayList<>(cpus);
        // Отправляем задачи на обработку.
        for (List<String> strLine : param) {
            Future<Map<String, Integer>> future =
                    pool.submit(() -> countWords(strLine));

            futures.add(future);
        }

        Map<String, Integer> counts = new HashMap<>();
        // Собираем результаты выполнения.
        for (Future<Map<String, Integer>> future : futures) {
            Map<String, Integer> map = future.get();

            for(Map.Entry<String, Integer> t : map.entrySet()){
                if(counts.containsKey(t.getKey())){
                    counts.merge(t.getKey(), t.getValue(), (i1,i2) -> i1+i2);
                } else {
                    counts.put(t.getKey(), t.getValue());

                }
            }
        }
        // Объединяем все счётчики и находим 10 наиболее часто
        // встречающихся слов.
        List<String> top10Words = top10(counts);

        System.out.println(top10Words);

        pool.shutdown();
    }

    private static Map<String, Integer> countWords(List<String> lines) {
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


        return map;
    }

    private static List<String> top10(Map<String, Integer> counters) {
        // todo implement
        return counters.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .map((o1) -> o1.getKey() + " = " + o1.getValue())
                .collect(Collectors.toList());
    }
}
