package com.tnsif.multithreading;

public class ChildThread extends Thread {

    private int startRange;
    private int endRange;

    // Constructor to initialize variables and name the thread
    public ChildThread(int start, int end, String name) {
        super(name); // Use constructor that accepts a name [8]
        this.startRange = start;
        this.endRange = end;
    }

    // The run method contains the logic for the thread's task [10]
    @Override // Must add @override when overriding the method [10]
    public void run() {
        // Loop to print numbers in the given range [10]
        for (int i = startRange; i <= endRange; i++) {
            
            // Display which thread is printing using current thread and get name methods [12]
            System.out.println(Thread.currentThread().getName() + " is printing number: " + i);
            
            try {
                // Use the sleep method to introduce a pause [12]
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                // sleep() must be enclosed in a try-catch block [12]
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
        }
    }
}
