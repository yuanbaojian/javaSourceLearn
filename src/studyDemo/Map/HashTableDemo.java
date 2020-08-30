package studyDemo.Map;

import java.util.Hashtable;

/**
 * HashTable
 *
 **/
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String ,String> hashTable = new Hashtable();
        hashTable.put("hello", "world");
        hashTable.put("hello2", "world2");
        for (String key : hashTable.keySet()) {
            System.out.println("hashTable = " + hashTable.get(key));
        }
    }
}
