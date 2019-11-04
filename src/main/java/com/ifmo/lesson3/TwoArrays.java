package com.ifmo.lesson3;

import java.util.Arrays;
import java.util.Random;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers();
        int[] randomNumbers2 = randomNumbers();
        System.out.println(Arrays.toString(randomNumbers1));
        System.out.println(Arrays.toString(randomNumbers2));
        // TODO implement

        int average1 = average(randomNumbers1);
        int average2 = average(randomNumbers2);
            if (average1>average2)
                System.out.println("average1 = " + average1);
            else if (average2>average1)
                System.out.println("average2 = " + average2);
            else
                System.out.println("average1=average2 = " + average2);
        // TODO implement
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randomNumbers = new int[5];
        for (int i = 0; i < 5; i++) {
            Random rnd = new Random();
            randomNumbers[i] = rnd.nextInt(6);
        }
        return randomNumbers;
    }

    public static int average(int[] randomNumbers) {
        // TODO implement
        int average = 0;
        //int sum = 0;
            for (int i = 0; i<5; i++){
                average += randomNumbers[i];
        }
           // average = sum/5;
        return average;
    }
}
