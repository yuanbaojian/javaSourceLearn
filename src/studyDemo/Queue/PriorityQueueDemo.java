package studyDemo.Queue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        PriorityQueueDemo priorityQueueDemo = new PriorityQueueDemo();
        int[] ints = priorityQueueDemo.topKFrequent(nums, 2);
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new LinkedHashMap();
        for (int i = 0; i < nums.length; i++) {
            Integer tempCount = map.getOrDefault(nums[i], 0);
            map.put(nums[i],++tempCount);
        }
        PriorityQueue<Entry> priorityQueue = new PriorityQueue<>(k, (o1, o2) -> o2.count - o1.count);
        map.forEach( (key,value)->{
            priorityQueue.add(new Entry(key,value));
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll().value;
        }
        return result;
    }

    class Entry{

        public Entry(int value ,int count){
            this.value = value;
            this.count = count;
        }

        int value;

        int count;

    }
}
