package com.tnsif.multithreading;

public class ThreadsDemo {
    public static void main(String[] args) {
        // Create multiple thread instances [12]
        ChildThread thread1 = new ChildThread(1, 5, "Child-A");
        ChildThread thread2 = new ChildThread(6, 10, "Child-B");

        // Threads begin concurrent execution only after start() is called [11]
        thread1.start();
        thread2.start();

        // Pause the main thread using join() to ensure child threads execute first [11]
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
             // join() must be placed within a try-catch block [11]
             System.out.println("Main thread was interrupted.");
        }
        
        System.out.println("The Main thread finished execution and the program is ending.");
    }
}
