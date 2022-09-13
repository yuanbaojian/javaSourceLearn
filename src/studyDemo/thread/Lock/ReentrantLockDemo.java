package studyDemo.thread.Lock;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    public static ExecutorService executorService = new ThreadPoolExecutor(5, 10, 1, TimeUnit.MINUTES
            , new ArrayBlockingQueue<>(10), (t,e)->{
        System.out.println("线程为 " + t + "异常为" + e.toString());
    });




    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        //reentrantLock.unlock();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        for (int i = 0; i < 2; i++) {
            executorService.submit(()->{
                reentrantLock.lock();
                countDownLatch.countDown();
            });
        }
        //countDownLatch.await();
        System.out.println("tryLock = " );
    }
}
