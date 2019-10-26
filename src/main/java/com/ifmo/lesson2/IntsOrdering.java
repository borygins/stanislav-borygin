package com.ifmo.lesson2;

public class IntsOrdering {
    /*
     В три переменные a, b и c явно записаны программистом три целых попарно неравных
     между собой числа. Создать программу, которая переставит числа в переменных таким
     образом, чтобы при выводе на экран последовательность a, b и c оказалась строго
     возрастающей.

     Числа в переменных a, b и c: 3, 9, -1
     Возрастающая последовательность: -1, 3, 9

     Числа в переменных a, b и c: 2, 4, 3
     Возрастающая последовательность: 2, 3, 4

     Числа в переменных a, b и c: 7, 0, -5
     Возрастающая последовательность: -5, 0, 7
     */
    public static void main(String[] args) {
        int a = 3, b = 9, c = -1;

        String ordering = ordering(a, b, c);

        System.out.println(ordering);
    }

    public static String ordering(int a, int b, int c) {
        // TODO implement
       int d = 0, e = 0, f = 0;
//        if (a > b && a > c)
//            d = a;
//        else if (b > a && b > c)
//            d = b;
//        else if (a < b && a < c)
//            f = a;
//        else if (b < a && b < c)
//            f = b;
//        else
//            d = c;
//
//        // else if ()
//        //int e = b;
//        //int f = c;
        return "Числа в переменных a, b и c: " + a + ", " + b + ", " + c + "\n" +
              "Возрастающая последовательность: " + d + ", " + e + ", " + f;
  //      return "";
    }
}
