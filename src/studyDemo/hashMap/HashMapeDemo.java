package studyDemo.hashMap;


import java.util.HashMap;

/**
 * @Author hashCodeDemo1
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class HashMapeDemo {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("hello", "world");
        hashMap.put("hello", "world2");
        System.out.println("hashMap = " + hashMap);
    }
}
