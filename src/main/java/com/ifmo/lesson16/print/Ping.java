package com.ifmo.lesson16.print;

import java.io.Serializable;

public class Ping implements Serializable {
    private final String text;

    public Ping(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
