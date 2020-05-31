package studyDemo.List.ArrayListDemo;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author LinklistDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class LinklistDemo {


    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add(null);
        list.add("hello");
        list.add("world");
        list.add(null);
        list.remove(null);
        System.out.println("list = " + list);
    }
}
