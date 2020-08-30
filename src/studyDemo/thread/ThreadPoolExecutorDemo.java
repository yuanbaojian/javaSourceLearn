package studyDemo.thread;

import java.util.concurrent.*;

/**
 * @Author ThreadPoolExecutorDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class ThreadPoolExecutorDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TimeUnit unit;
        BlockingQueue workQueue;
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(
                        2,
                        4,
                        30,
                        TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(10),
                        Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.DiscardPolicy());

        //活跃的线程数
        int activeCount = threadPoolExecutor.getActiveCount();
        System.out.println("activeCount = " + activeCount);
        int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
        System.out.println("maximumPoolSize = " + maximumPoolSize);
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        System.out.println("corePoolSize = " + corePoolSize);
        for(int i = 0; i < 15; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(10);
                    } catch (InterruptedException e) {

                    }
                    System.out.println(Thread.currentThread().getName() +" execute the task without result " );
                }
            });
        }


        Future<String> result = threadPoolExecutor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "submit the tash with resutl";
            }
        });
        String resultString = result.get();
        System.out.println("resultString = " + resultString);
    }
}
