package studyDemo.Map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author HashMapSyncDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class MapSyncDemo {
    private static HashMap<String, Integer> map = new HashMap<>();

    //HashMap线程不安全
    public void add(String key){
        Integer value = map.get(key);
        if(value == null){
            map.put(key,1 );
        } else{
            map.put(key, value+1);
        }
    }
    /**
    * <p>HashMap线程不安全
     * 就算加了synchronized也不能保证线程安全
     * </p>
     * @param key
     * @return void
     * @author yuanbaojian
     * @date 2020/7/29
     * @time 11:41
     */
    public synchronized void syncAdd(String key){
        Integer value = map.get(key);
        if(value == null){
            map.put(key,1 );
        } else{
            map.put(key, value+1);
        }
    }

    private static ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

    public void concurrentAdd(String key){
        Integer value = concurrentHashMap.get(key);
        if(value == null){
            concurrentHashMap.put(key,1 );
        } else{
            concurrentHashMap.put(key, value+1);
        }
    }

    public static void main(String[] args) {
        MapSyncDemo hashMapSyncDemo = new MapSyncDemo();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i < 1000; i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                    //add方法线程不安全(使用HashMap)
                    hashMapSyncDemo.add("hello"+ finalI);
                    //使用线程安全的add方法
                    // hashMapSyncDemo.concurrentAdd("hello"+ finalI);

                }
            });
        }
        System.out.println(map);
    }
}
