package com.gaurab.multithreading.WorkingWithTwoThreadsSameTime;

public class MyThreadTwo extends Thread{
    public void run(){
//        task for thread...
        for (int i=10;i>=1;i--){
            System.out.println("Thread Class: "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
