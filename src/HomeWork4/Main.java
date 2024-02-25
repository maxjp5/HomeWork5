package HomeWork4;

public class Main {
    public static void main(String[] args) {

        SemaphoreExample.SharedResource = new SemaphoreExample.SharedResource(2); //allow 2 threads access a time

        Thread thread1 = new SemaphoreExample.Worker("Thread 1", SemaphoreExample.SharedResource);
        Thread thread2 = new SemaphoreExample.Worker("Thread 2", SemaphoreExample.SharedResource);
        Thread thread3 = new SemaphoreExample.Worker("Thread 3", SemaphoreExample.SharedResource);


        thread1.start();
        thread2.start();
        thread3.start();

       thread1.join();
        thread2.join();
        thread3.join();
    }
}
