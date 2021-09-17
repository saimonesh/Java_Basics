import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImplementation_basic {
    class values
    {
        char a;
        int count=0;

        public values(char a, int count) {
            this.a = a;
            this.count = count;
        }
    }


    public void testing()
    {
        Queue<values> myque= new PriorityQueue<>((o1, o2) -> {
            return ((values) o1).count - ((values) o2).count;
        });
        myque.add(new values('a',34));
        myque.add(new values('b',1));
        myque.add(new values('c',-12));



    }
}
