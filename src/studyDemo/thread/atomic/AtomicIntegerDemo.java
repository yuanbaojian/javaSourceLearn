package studyDemo.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Integer原子类
 **/
public class AtomicIntegerDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println("atomicInteger.incrementAndGet() = " + atomicInteger.incrementAndGet());
    }
}
