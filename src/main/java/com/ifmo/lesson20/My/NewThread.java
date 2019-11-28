package com.ifmo.lesson20.My;


public class NewThread implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            try{

                System.out.println("Thread " + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
//            catch (InterruptedException e){
//                Thread.currentThread().interrupt();
//                e.printStackTrace();
//            }
        }
    }
}
