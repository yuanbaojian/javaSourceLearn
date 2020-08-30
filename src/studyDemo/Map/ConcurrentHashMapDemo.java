package studyDemo.Map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 线程安全的hashMap
 **/
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("hello", "hello");
        concurrentHashMap.put("world", "world");
        System.out.println("concurrentHashMap = " + concurrentHashMap);
    }
}
