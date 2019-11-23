package com.ifmo.lesson3;

import java.util.Arrays;

public class Fibonacci20 {
    /*
    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
    что первый и второй члены последовательности равны единицам, а каждый следующий —
    сумме двух предыдущих.
     */
    public static void main(String[] args) {
//        int[] fibonacciNumbers =
                fibonacciNumbers();
//        System.out.println(Arrays.toString(fibonacciNumbers));
//         TODO implement
    }

    public static int[] fibonacciNumbers() {
        // TODO implement
        int[] fibonacciNumbers = new int[20];
        int a=1;
        int b=0;
        for (int i=0; i<20; i++){
            int f = a + b;
            fibonacciNumbers[i] = f;
            System.out.print(f);
            a = b;
            b = f;}
        return fibonacciNumbers;
    }
}
//Done