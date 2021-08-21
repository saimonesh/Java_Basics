import java.util.PriorityQueue;

public class Graph {
    int vertex;
    int[] distance;
    private PriorityQueue<Node> queue;
    Graph(int v)
    {
        this.vertex=v;
        distance=new int[v];
        queue=new PriorityQueue<>(v,new Node());
    }

}
