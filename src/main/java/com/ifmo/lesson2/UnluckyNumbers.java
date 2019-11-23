package com.ifmo.lesson2;

public class UnluckyNumbers {
    /*
    В американской армии считается несчастливым число 13, а в японской — 4. Перед
    международными учениями штаб российской армии решил исключить номера боевой
    техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы не
    смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс. единиц боевой
    техники и каждая боевая машина имеет номер от 00001 до 99999, то сколько всего номеров
    придётся исключить?
     */
    public static void main(String[] args) {
        System.out.println(unluckyNumbersCount());
    }

    public static int unluckyNumbersCount() {
        // TODO implement
        int a, b, c, d, e, n = 0;
        for (int i = 1; i < 100000; i++) {
            a = i/10000;
            b = (i/1000)%10;
            c = (i/100)%10;
            d = (i/10)%10;
            e = i % 10;
            if (a == 4 || b == 4 || c == 4 || d == 4 || e == 4)
                n++;
            else if ((a==1&&b==3)||(b==1&&c==3)||(c==1&&d==3)||(d==1&&e==3))
                n++;
        }
        return n;
    }
}
//Done