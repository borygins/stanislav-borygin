package com.ifmo.lesson2;

public class SymmetricClocks {
    /*
    Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько
    раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
    для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
     */
    public static void main(String[] args) {
        System.out.println(symmetricTimes());
    }

    public static int symmetricTimes() {
        // TODO implement
        int n = 0;
        for (int h = 0; h<24; h++){
            for (int m = 0; m<60; m++){
                int h1=h/10;
                int h2=h%10;
                int m1=m/10;
                int m2=m%10;
                if (h1==m2&&h2==m1)
                     n++;
            }
        }
        return n;
    }
}
//Done