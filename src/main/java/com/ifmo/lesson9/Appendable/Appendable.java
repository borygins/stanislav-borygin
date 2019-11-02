package com.ifmo.lesson9.Appendable;

public interface Appendable<T> {
    Appendable<String> append(String o);

    Appendable<T> append(T o);
    T value();
}