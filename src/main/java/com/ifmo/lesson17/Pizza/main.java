package com.ifmo.lesson17.Pizza;

public class main {
    public static void main(String[] args) {
        Pizza tophot = new Pizza.Builder("Tonkoe","Cheder").setCatchup(4).setTomato(2).build();
        System.out.println(tophot);

    }
}
