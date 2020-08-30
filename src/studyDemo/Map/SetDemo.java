package studyDemo.Map;

import org.junit.Test;

import java.util.*;

/**
 * @Author MapDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class SetDemo {
    @Test
    public void test(){
        Set<String> set = new HashSet();
        set.add("hello");
        set.add("world");

        // 增强for循环直接遍历
        for (String o : set) {
          System.out.println("o = " + o);
        }
        // iterator遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("next = " + next);
        }

    }
}
