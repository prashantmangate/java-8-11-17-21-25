package main.java.com.java25.concurrency;

public class VirtualThreadExample {
    static void main() throws InterruptedException {

        Thread t1 = Thread.ofVirtual().start( () -> IO.println("This is "+Thread.currentThread()));

        t1.join();
    }
}