package com.ifmo.lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquareEquation {
    /*
     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
     будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
     либо сообщать, что корней нет.
     */
    public static void main(String[] args) {
        double a = 2;
        double b = -9;
        double c = 9;

        double[] roots = squareEquationRoots(a, b, c);

        System.out.println(Arrays.toString(roots));
    }

    /*
    Возвращает массив из двух корней или null, если таковых нет.
     */
    public static double[] squareEquationRoots(double a, double b, double c) {
        // TODO implement
        double d = b*b-4*a*c;
        double [] arr;// = new Array[];
        arr = new double[2];
        if (d>=0){
                double x1 = (-b + Math.sqrt(d))/(2*a);
                double x2 = (-b - Math.sqrt(d))/(2*a);
                arr[0] = x1;
                arr[1] = x2;
                return arr;
        //else if (d==0){
          //      double x1 = (-b)/(2*a);
          //      return [] x1 ;
        }
        else
                return null;
    }
}
//Done