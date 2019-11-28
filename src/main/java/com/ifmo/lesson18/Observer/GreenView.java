package com.ifmo.lesson18.Observer;

import java.util.ArrayList;
import java.util.List;

public class GreenView implements View {
    private List<View> listeners = new ArrayList<>();

    public void subscribe(View listener) {
        listeners.add(listener);
    }

    public void unsubscribe(View listener) {
        listeners.remove(listener);
    }
    public void newMassage (String message) {
        System.out.println("Сработал датчик - " + message);
//        notifyListeners();

    }
    private void notifyListeners(int temp) {
        for (View listener : listeners)
            listener.viewMsg(temp);
    }
    @Override
    public void viewMsg(int temp) {
        if (temp > 70) {
//            System.out.println("Green");

        }
    }
}
