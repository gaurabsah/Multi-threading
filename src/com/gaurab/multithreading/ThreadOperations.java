package com.gaurab.multithreading;

class UserThread extends Thread{
    public void run(){
//        task for thread...
        System.out.println("User Defined Thread");
    }
}

public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Program Started...");

        int x = 20 + 35;
        System.out.println("Sum: "+x);

       Thread t = Thread.currentThread();
       System.out.println("Name of Current Thread: "+t.getName());

       t.setName("MyThread");
       System.out.println("Name of Current Thread after setting: "+t.getName());

       try {
           Thread.sleep(5000);
       } catch (Exception e){
           e.printStackTrace();
       }

       System.out.println("Id of current thread: "+t.getId());

//       going to start user defined thread...
        UserThread userThread = new UserThread();
        userThread.start();
       System.out.println("Program Ended...");
    }
}
