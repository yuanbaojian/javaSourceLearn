package studyDemo.List.ArrayListDemo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
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

    @Test
    public void test(){
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if(item == "3" ){
                iterator.remove();
            }
        }
        System.out.println("list.toString() = " + list.toString());
    }
}
