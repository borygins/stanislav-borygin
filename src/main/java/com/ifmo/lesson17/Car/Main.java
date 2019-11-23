package com.ifmo.lesson17.Car;

public class Main {
    public static void main(String[] args) {
        Factory car = Factory.getFactory("JP");
        System.out.println(car.createCar());
    }
}
