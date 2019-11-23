package com.ifmo.lesson17.Car;

public class BMW implements Car {

    @Override
    public int power() {
        return 150;
    }

    @Override
    public int maxSpeed() {
        return 220;
    }
}
