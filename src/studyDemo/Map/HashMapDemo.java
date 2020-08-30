package studyDemo.Map;


import java.util.*;

/**
* <p>
 *     用于研究HashMap的源码
* </p>
 * @author yuanbaojian
 * @date 2020/8/26
 * @time 9:59
 */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("hello1", "world");
        hashMap.put("hello2", "world2");
        hashMap.put(null,"null");
        Object hello = hashMap.get("hello");

        //1. keySet遍历
        for (Object o : hashMap.keySet()) {
            System.out.println("hashMap = " + hashMap.get(o));
        }


        // 2. values遍历
        Collection values = hashMap.values();
        for (Object value : values) {
            System.out.println("value = " + value);
        }

        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = (Map.Entry<String, String>) iterator.next();
            System.out.println("next.get = " + next.getValue());
        }

        // System.out.println("hashMap = " + hashMap);
    }


}
