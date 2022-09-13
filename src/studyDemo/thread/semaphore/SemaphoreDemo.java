package studyDemo.thread.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(10);
        for (int i = 0; i < 11; i++) {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("semaphore = " + semaphore);

    }

}
