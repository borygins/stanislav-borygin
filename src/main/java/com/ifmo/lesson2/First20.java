package com.ifmo.lesson2;

public class First20 {
    /*
     Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8
     16 32 64 128 ….
     */
    public static void main(String[] args) {
        // TODO implement
        for (int i = 1; i<=20; i += 1) {
            int a = (int) Math.pow(2,i);
            System.out.println(a);
        }
    }
}
//Done