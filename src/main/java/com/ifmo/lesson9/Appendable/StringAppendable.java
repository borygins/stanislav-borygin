package com.ifmo.lesson9.Appendable;

public class StringAppendable<T> implements Appendable<T> {
    @Override
    public Appendable<String> append(String o) {
        return null;
    }

    @Override
    public Appendable<T> append(T o) {
        return null;
    }

    @Override
    public T value() {
        return null;
    }

}
