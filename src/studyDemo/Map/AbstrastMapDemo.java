package studyDemo.Map;

import java.util.AbstractMap;
import java.util.Set;

/**
 * 这丫就是个抽象类
 **/
public class AbstrastMapDemo {
    public static void main(String[] args) {
        AbstractMap<String ,String> abstractMap = new AbstractMap() {
            @Override
            public Set<Entry> entrySet() {
                return null;
            }
        };

        abstractMap.put("hello", "world");
        for (String key : abstractMap.keySet()) {
            System.out.println("abstractMap = " + abstractMap.get(key));
        }
    }
}
