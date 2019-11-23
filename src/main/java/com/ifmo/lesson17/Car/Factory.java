package com.ifmo.lesson17.Car;

public abstract class Factory {
    static Factory getFactory(String ContryCode) {
        switch (ContryCode) {
            case "JP":
                return new JpFactory();
            case "GE":
                return new GeFactory();
            case "default":
                break;
        }

        return null;
    }
public abstract Car createCar ();
}
