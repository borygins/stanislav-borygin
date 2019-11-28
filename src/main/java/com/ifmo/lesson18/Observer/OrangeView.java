package com.ifmo.lesson18.Observer;

public class OrangeView implements View {
    @Override
    public void viewMsg(int temp) {
        if (temp > 110) {
            System.out.println("Orange");
        }
    }
}
