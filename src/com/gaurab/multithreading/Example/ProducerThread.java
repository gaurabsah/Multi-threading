package com.gaurab.multithreading.Example;

public class ProducerThread extends Thread{
    Company c;

    public ProducerThread(Company c){
        this.c=c;
    }
    public void run(){
        int i=1;
        while (true){
            this.c.produce_item(i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
               e.printStackTrace();
            }

            i++;
        }
    }
}
