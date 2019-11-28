package com.ifmo.lesson20.My;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());


        Thread thread = new Thread(new NewThread());
        thread.start();

        Thread.sleep(3000);

        thread.interrupt();
        thread.join();

    }
}
