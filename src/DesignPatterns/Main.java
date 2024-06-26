package DesignPatterns;


import DesignPatterns.SIngletonDesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {

        // create Threads

        Thread thread1 = new Thread(()->{

            // Thread 1 is trying to get Inst

            Singleton singleton1 = Singleton.getInstance();
            singleton1.printMessage("From first Thread");

        });

        Thread thread2 = new Thread(()->{

            // Thread 1 is trying to get Inst

            Singleton singleton2 = Singleton.getInstance();
            singleton2.printMessage("From Second Thread");

        });


        // Start both threads

        thread1.start();
        thread2.start();

        // Join threads to wait for them to finish

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
