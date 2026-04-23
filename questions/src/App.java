package com.daily;

class Runner1 implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<=6; i++){
            System.out.println("runner1 : " + i);
        }
    }
}

public class App {

    public static void main(String[] args) {
        var t1 = new Thread(new Runner1());
        var t2 = new Thread(() -> {
            for(int i=0; i<=5; i++) {
                System.out.println("Runner 2 : " + i);
            }
        });
        t1.start();
        System.out.println(Thread.currentThread().getName() +" : " + Thread.currentThread().getPriority());
        t2.start();

        for(Thread t : Thread.getAllStackTraces().keySet()) {
            System.out.println("Thread name: " + t.getName() + " ,State: " + t.getState());
        }

        try {
            t1.join();
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("main thread doesn't wait");
    }
}
