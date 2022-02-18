package studyDemo.Queue;


import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author BlockingQueueDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);
        boolean a = blockingQueue.add("a");
        System.out.println("a = " + a);
        boolean b = blockingQueue.add("b");
        System.out.println("b = " + b);
        boolean c = blockingQueue.add("c");
        System.out.println("c = " + c);
        //容量是3， 放入第四个，会报错 Queue full
        boolean d = blockingQueue.add("d");
        System.out.println("d = " + d);
        blockingQueue.remove();
        blockingQueue.remove();
        blockingQueue.remove();
        //只有3个元素，移除第4次，会报错 NoSuchElementException
        blockingQueue.remove();
        BlockingQueue blockingQueue1 = new LinkedBlockingQueue<>();


    }

    @Test
    public void test(){

    }
}
