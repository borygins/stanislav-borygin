package com.ifmo.lesson17.Car;

public class JpFactory extends Factory{
    @Override
    public Car createCar() {
        Car car = new Toyota();
        return car;
    }
}
