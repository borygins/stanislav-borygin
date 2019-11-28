package com.ifmo.lesson18.Observer;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<View> listeners = new ArrayList<>();

    public void subscribe(View listener) {
        listeners.add(listener);
    }
    public void unsubscribe(View listener) {
        listeners.remove(listener);
    }
    public void newMessage(String message) {
        System.out.println("Сработал триггер" + message);
////        notifyListeners(message);
    }

}
