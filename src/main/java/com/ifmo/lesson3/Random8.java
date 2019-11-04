package com.ifmo.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Random8 {
    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран
    в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
    экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        int[] replaceWithZeros = replaceWithZeros(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println(Arrays.toString(replaceWithZeros));
        // TODO implement

        int[] replacedWithZeros = replaceWithZeros(randomNumbers);

        // TODO implement
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randomNumbers = new int[8];
        for (int i = 0; i < 8; i++){
            Random rnd = new Random();
            randomNumbers[i] = rnd.nextInt(9)+1;
        }
        return randomNumbers;
    }

    public static int[] replaceWithZeros(int[] randomNumbers) {
        // TODO implement
        int[] replaceWithZeros = new int[8];
//        for (int i = 0; i < 8; i++){
//            if (randomNumbers[i]%2==0)
//                replaceWithZeros[i]=randomNumbers[i];
//        }
        for (int i = 0; i < 8; i++){
            if (i % 2 == 0)
                replaceWithZeros[i]=randomNumbers[i];
        }
        return replaceWithZeros;
    }
}
//Done