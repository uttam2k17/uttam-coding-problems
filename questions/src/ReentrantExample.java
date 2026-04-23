package com.daily;

//outerMethod and innerMethod are both synchronized.
//
//When a thread enters outerMethod, it acquires the object's intrinsic lock.
//
//It can then safely enter innerMethod—even though it's also synchronized—because it already holds the lock. This is re-entrant synchronization.

public class ReentrantExample {
    public synchronized void outerMethod() {
        System.out.println("Entered outerMethod");
        innerMethod(); // Calling another synchronized method
        System.out.println("Exiting outerMethod");
    }

    public synchronized void innerMethod() {
        System.out.println("Entered innerMethod");
        // Do something
        System.out.println("Exiting innerMethod");
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();

        Thread thread = new Thread(() -> {
            example.outerMethod();
        });

        thread.start();
    }
}
