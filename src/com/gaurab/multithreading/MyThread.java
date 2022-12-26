package com.gaurab.multithreading;

/*
Thread can be created using two ways:
1. By implementing Runnable Interface &
2. By extending Thread Class
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
//        task for thread...
        for(int i=0;i<=10;i++){
            System.out.println(i);
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
    }
}
