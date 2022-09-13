package studyDemo.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            countDownLatch.countDown();
        }
        System.out.println("countDownLatch = " + countDownLatch);
    }
}
