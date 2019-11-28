package com.ifmo.lesson18.Observer;

public class RedView implements View {
    @Override
    public void viewMsg(int temp) {
        if(temp >130){
            System.out.println("RED");
        }
    }
}
