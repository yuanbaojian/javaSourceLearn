package studyDemo.hashMap;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author hashCodeDemo1
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class HashMapeDemo {

    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap();
        hashMap.put("hello", "world");
        hashMap.put("hello", "world2");
        hashMap.put("stringKey", "world2");
        hashMap.get("hello");
        // String orDefault = hashMap.getOrDefault("stringKey", "stringValue");
        // System.out.println("orDefault = " + orDefault);

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("a","a");
    }
}
