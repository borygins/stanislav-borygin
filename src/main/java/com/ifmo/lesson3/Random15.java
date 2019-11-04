package com.ifmo.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Random15 {
    /*
     Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
     отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        System.out.println(Arrays.toString(randomNumbers));
        // TODO implement

        int evens = evens(randomNumbers);
        System.out.println(evens);
        // TODO implement
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randomNumbers = new int[15];
        for (int i = 0; i < 15; i++) {
            Random rnd = new Random();
            randomNumbers[i] = rnd.nextInt(10);
        }
        return randomNumbers;
    }

    private static int evens(int[] randomNumbers) {
        // TODO implement
        int evens = 0;
        for (int i = 0; i < 15; i++){
            if (randomNumbers[i] % 2 == 0)
                evens++;
        }
        return evens;
    }
}
//Done