package studyDemo.List;

import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author CopyOnWriteArrayListDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 1; i < 500; i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    copyOnWriteArrayList.add("hello" + finalI);
                    System.out.println(Thread.currentThread().getName() +" finalI = " + finalI);
                }
            });
        }
        System.out.println("copyOnWriteArrayList = " + copyOnWriteArrayList.toString());
    }
}
