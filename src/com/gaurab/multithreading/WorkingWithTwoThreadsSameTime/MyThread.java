package com.gaurab.multithreading.WorkingWithTwoThreadsSameTime;

/*
Thread can be created using two ways:
1. By implementing Runnable Interface &
2. By extending Thread Class
 */

public class MyThread implements Runnable{
    @Override
    public void run() {
//        task for thread...
        for(int i=1;i<=10;i++){
            System.out.println("Runnable Interface: "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
//        create object of MyThread class
        MyThread myThread = new MyThread();

//        create object of Thread Class because Runnable interface doesn't have start method
        Thread t = new Thread(myThread);
        t.start();

        MyThreadTwo myThreadTwo = new MyThreadTwo();
          /*
         Here we don't need to create object of Thread Class.
         Because MyThreadTwo Class is extending Thread Class and it has start method
         */

        myThreadTwo.start();
    }
}
