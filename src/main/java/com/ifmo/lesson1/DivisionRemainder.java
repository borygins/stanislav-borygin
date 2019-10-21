package com.ifmo.lesson1;

public class DivisionRemainder {
    /*
    В переменных q и w хранятся два натуральных числа. Создайте программу,
    выводящую на экран результат деления q на w с остатком.
    Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
    21 / 8 = 2 и 5 в остатке
     */
    public static void main(String[] args) {
        int a = 21;
        int b = 8;
        calculate(a,b);
    }
    public static void calculate(int a, int b) {
        int c = a / b;
        int d = a % b;
        System.out.printf("%s / %s = %s и %s в остатке\n", a, b, c, d);
    }
}
//Done