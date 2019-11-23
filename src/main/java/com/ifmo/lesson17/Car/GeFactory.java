package com.ifmo.lesson17.Car;

public class GeFactory extends Factory {
    String ContryCode = "GE";
    @Override
    public Car createCar() {
        Car car = new BMW();
        return car;
    }
}
