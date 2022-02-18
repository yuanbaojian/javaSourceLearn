package studyDemo.List.ArrayListDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author ArrayListDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        System.out.println("list = " + list);
    }

    @Test
    public void test(){
        System.out.println("10>>1 = " + (10 >> 2));;
    }
}
