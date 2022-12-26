package com.gaurab.multithreading;

public class MyThreadTwo extends Thread{
    public void run(){
//        task for thread...
        for (int i=10;i>=1;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThreadTwo myThreadTwo = new MyThreadTwo();

        /*
         Here we don't need to create object of Thread Class.
         Because MyThreadTwo Class is extending Thread Class and it has start method
         */

        myThreadTwo.start();
    }
}
