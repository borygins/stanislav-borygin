package com.ifmo.lessons12;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    interface Predicate<T> {
        boolean isValid(T value);
    }
public static <T> List<T> filter(List<T> list, Predicate<T> filter){
    List<T> result = new ArrayList<>();
    for (T item: list) {
        if (filter.isValid(item))
            result.add(item);
    }
    return result;
}

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4,5);
        List<Integer> even = filter(integers, i -> i % 2 == 0);
        even.forEach(System.out::println);
        System.out.println("===");
        filter(integers, i -> i > 2).forEach(System.out::println);

    }
}
