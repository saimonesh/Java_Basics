import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class JobScheduler_LeetCode {
    public int leastInterval(char[] tasks, int n) {

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue().compareTo(b.getValue()) //Comparator
        );
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character c:tasks)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        pq.addAll(map.entrySet());
        return -1;
    }
}
