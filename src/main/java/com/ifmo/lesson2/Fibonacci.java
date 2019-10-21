package com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        // TODO implement
        int a=1;
        int b=0;
        for (int i=0; i<11; i++){
          int f = a + b;
            System.out.println(f);
            a = b;
            b = f;
        }
    }
}
//Done