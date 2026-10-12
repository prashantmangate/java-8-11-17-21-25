void main() throws InterruptedException {

    Thread t1 = Thread.ofVirtual().start( () -> IO.println("This is "+Thread.currentThread()));
    if(t1.isDaemon())
        IO.println("Yes, it is daemon thread");
    if(t1.isVirtual())
        IO.println("Yes, it is virtual thread");
    if(t1.isAlive())
        IO.println("Yes, it is alive thread");
    if(t1.isInterrupted())
        IO.println("Yes, it is interrupted thread");

    t1.join();
}