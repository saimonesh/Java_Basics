import java.util.Comparator;

public class Node implements Comparator<Node> {
    Integer node;
    Integer cost;
    public Node(){}
    Node(int node,int cost)
    {
        this.node=node;
        this.cost=cost;
    }
    @Override
    public int compare(Node o1, Node o2) {
        if(o1.cost<o2.cost)return -1;
        else return 1;
    }
}
