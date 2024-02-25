package HomeWork4;
//Evgeny Vasilev 336550686 
//Maxim Sirotenko 328663547
//https://github.com/Evgeny865/HomeWork5/tree/master/src/HomeWork4

public class Main {
    public static void main(String[] args) {

        SemaphoreExample.SharedResource = new SemaphoreExample.SharedResource(2);

        Thread thread1 = new SemaphoreExample.Worker("Thread 1", SemaphoreExample.SharedResource);
        Thread thread2 = new SemaphoreExample.Worker("Thread 2", SemaphoreExample.SharedResource);
        Thread thread3 = new SemaphoreExample.Worker("Thread 3", SemaphoreExample.SharedResource);


        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();

        } catch (InterruptedException e) {
        }
    }
}
