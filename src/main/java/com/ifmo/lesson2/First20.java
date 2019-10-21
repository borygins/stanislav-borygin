package com.ifmo.lesson2;

public class First20 {
    /*
     Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8
     16 32 64 128 ….
     */
    public static void main(String[] args) {
        // TODO implement
        for (int i = 1; i <= 20*20; i *= 2) {
           //int a = 0;
            int a = i * 2;
            System.out.print(a);
        }
    }
}