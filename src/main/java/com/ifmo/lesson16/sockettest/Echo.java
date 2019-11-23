package com.ifmo.lesson16.sockettest;

import java.io.Serializable;

public class Echo implements Serializable {
    private final String text;

    public Echo(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Echo{" +
                "text='" + text + '\'' +
                '}';
    }
}
