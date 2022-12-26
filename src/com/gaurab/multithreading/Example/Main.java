package com.gaurab.multithreading.Example;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        ProducerThread producerThread = new ProducerThread(company);
        ConsumerThread consumerThread = new ConsumerThread(company);

        producerThread.start();
        consumerThread.start();

    }
}
