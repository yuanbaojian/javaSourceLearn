package studyDemo.List.ArrayListDemo;

import java.util.Vector;

/**
 * @Author VectorDemo
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("hello");
        vector.add("world");
        for (String s : vector) {
            System.out.println("s = " + s);
        }
    }
}
