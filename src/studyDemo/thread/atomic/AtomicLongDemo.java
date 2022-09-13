package studyDemo.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Integer原子类
 **/
public class AtomicLongDemo {

    public static ThreadLocal threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("hello");
        AtomicLong atomicLong = new AtomicLong();
        System.out.println("atomicInteger.incrementAndGet() = " + atomicLong.incrementAndGet());
    }
}
