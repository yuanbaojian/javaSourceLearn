package studyDemo.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i);
        }
        System.out.println("sortedSet = " + sortedSet);
    }
}
