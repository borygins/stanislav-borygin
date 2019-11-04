package com.ifmo.lesson3;

import java.util.Arrays;

public class UnevenArray {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
    этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
    1)
     */
    public static void main(String[] args) {
        int[] unevenArray = unevenArray();
       // System.out.println(Arrays.toString(unevenArray));
        // TODO implement
        System.out.println("");
        for (int i = unevenArray.length-1; i >= 0 ; i--){
            System.out.print(unevenArray[i] + " ");
        }
    }

    public static int[] unevenArray() {
        // TODO implement
        int[] unevenArray = new int[50];
        int value = 1;
        for (int i = 0; i <50 ; i++) {
           // while (value < 100)
                unevenArray[i] = value;
                value += 2;
            System.out.print(unevenArray[i] + " ");
        }
        return unevenArray;
    }
}
//Done