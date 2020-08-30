package studyDemo.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author SetDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class SetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("hello");
        set.add("hello");
        set.add("world");
        for (String s : set) {
            System.out.println("s = " + s);
        }

        Set set1 = new HashSet();;
        set1.add("封装");
        set1.add("hello");
        set1.add("继承");
        set1.add("多态");
        Set set2 = new HashSet();
        set2.add("hello");
        set2.add("继承");
        set2.add("多态");
        set2.add("封装");
        System.out.println("set2 = " + set2);
        
    }
}
