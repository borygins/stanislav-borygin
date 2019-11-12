package com.ifmo.lesson13;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

public class StreamTasks {

    private static class Person {
        private final String name;
        private final int age;
        private final String country;

        public Person(String name, int age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }
    }

    public static void main(String[] args) {
        Stream<Person> people = generatePeople(100);
//        Stream<Person> people = Stream.of(
//                new Person(),
//                new Person(),
//                new Person()
//        );

        List<String> countries = countriesSortedByTheirPopulationDescending(people);
        String countryThatHasMostKids = countryThatHasMostKids(people);
        Map<String, Integer> populationByCountry = populationByCountry(people);

        System.out.println(countries);
        System.out.println(countryThatHasMostKids);
        System.out.println(populationByCountry);

        List<String> words = List.of("the", "hello", "approximation", "greetings", "java", "war");

        Map<Integer, Set<String>> wordsByLength = groupWordsByLength(words);
        int averageWordLength = averageWordLength(words);
        Set<String> longestWords = longestWords(words);

        System.out.println(wordsByLength);
        System.out.println(averageWordLength);
        System.out.println(longestWords);
    }

    // Метод возвращает страны в порядке убывания их населения.
    public static List<String> countriesSortedByTheirPopulationDescending(Stream<Person> people) {
        // TODO implement.
//people.sorted()

        return List.of();
    }

    // Метод находит страну (или одну из стран), в которых больше всего человек в возрасте
    // до 18 лет.
    public static String countryThatHasMostKids(Stream<Person> people) {
        // TODO implement.

        return null;
    }

    // Метод возвращает карту стран их населения.
    public static Map<String, Integer> populationByCountry(Stream<Person> people) {
        // TODO implement.

        return Map.of();
    }
   public static List<String> CONTRIES = List.of("USA", "Russia", "India", "Japan", "Egypt");
    public static List<String> NAME = List.of("Petya", "Vasya", "Masha", "Gosha", "Jhon");
    // Метод генерирует случайных людей в ограниченном наборе стран.
    // number - число желаемых людей.
    public static Stream<Person> generatePeople(int number) {
        // TODO implement.
        Random rnd = new Random();
        Stream.generate(
                () -> new Person( NAME.get(rnd.nextInt(NAME.size())),rnd.nextInt(), CONTRIES.get(rnd.nextInt(CONTRIES.size()))))
                .limit(number);
        return Stream.of();
    }

    // Метод возвращает карту сгруппированных слов по их длине. Например, для
    // трёхбуквенных слов будет:
    // 3 -> "the", "map", "got", "war"...
    public static Map<Integer, Set<String>> groupWordsByLength(List<String> words) {
        // TODO implement.

        return Map.of();
    }

    // Метод находит среднюю длину слов в списке.
    public static int averageWordLength(List<String> words) {
        // TODO implement.

        return 0;
    }

    // Метод находит самое длинное слово или слова, если таких несколько.
    public static Set<String> longestWords(List<String> words) {
        // TODO implement.

        return Set.of();
    }


}
