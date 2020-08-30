package studyDemo.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author SynchronizedList
 * 返回一个线程安全的List
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class SynchronizedListDemo {

    public static void main(String[] args) throws InterruptedException {
        List list = new ArrayList();
        List list2 = new ArrayList();
        List synchronizedList = Collections.synchronizedList(list2);

        ExecutorService executorService = Executors.newCachedThreadPool();
        checkThreadSafe(synchronizedList, executorService);
        System.out.println("list.size() = " + synchronizedList.size());
    }

    /**
    * <p>ArrayList线程不安全
     * 会报错 java.util.ConcurrentModificationException  / 或者发生少加的情况
     *
     *
     * Collections.synchronizedList 返回一个线程安全的List,
     * 但是在使用iterator时，建议加锁
     * </p>
     * @param list
     * @param executorService
     * @return void
     * @author yuanbaojian
     * @date 2020/8/12
     * @time 14:04
     */
    private static void checkThreadSafe(List list, ExecutorService executorService) throws InterruptedException {
        for(int i = 0; i < 500; i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    list.add("hello" + finalI);
                    System.out.println(Thread.currentThread().getName() +" finalI = " + finalI);
                }
            });
        }
        //终止executorService，再执行下一步
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" 所以线程已结束 " );
    }


}
