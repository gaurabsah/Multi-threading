package com.gaurab.multithreading.Example;

public class ConsumerThread extends Thread{
    Company c;

    public ConsumerThread(Company c){
        this.c=c;
    }

    public void run(){

        while (true){
            this.c.consume_item();

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
