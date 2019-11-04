package com.ifmo.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Random12 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
    элемент является в этом массиве максимальным и сообщите индекс его последнего
    вхождения в массив.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        System.out.println(Arrays.toString(randomNumbers));
        // TODO implement

        int max = max(randomNumbers);
        //System.out.println(max);
        int maxLastIndex = lastIndexOf(randomNumbers, max);
        System.out.println(maxLastIndex);
        // TODO implement
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randomNumbers = new int[12];
        for (int i = 0; i < 12; i++) {
            Random rnd = new Random();
            randomNumbers[i] = rnd.nextInt(30) - 15;
        }
        return randomNumbers;
    }

    public static int max(int[] randomNumbers) {
        int[] randomNumbers2 = randomNumbers.clone();
        Arrays.sort(randomNumbers2);
        int max = randomNumbers2[11];
        // TODO implement
        return max;
    }

    public static int lastIndexOf(int[] randomNumbers, int max) {
        // TODO implement
        for (int i = 11; i > 0; i--) {
            if (randomNumbers[i] == max)
                return i;
        }
        return 0;
    }
}
//Done
