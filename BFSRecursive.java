import java.util.*;


class Graph {
    private int nodes;
    private LinkedList<Integer> edges[];

    Graph(int v) {
        nodes = v;
        edges = new LinkedList[v];
        for (int i=0;i<v;i++) {
            edges[i] = new LinkedList();
        }
    }

    void addEdge(int source, int dest) {
        edges[source].add(dest);
    }

    void BFS(Queue<Integer> queueu, int[] visited) {
        if (queueu.isEmpty())
            return;
        int start = queueu.poll();
        //System.out.println(queueu);
        System.out.println(start);
        for(int i=0;i<edges[start].size();i++) {
            int curr = edges[start].get(i);
            if (visited[curr] != 1) {
                visited[curr] = 1;
                queueu.add(curr);
            }
        }
        BFS(queueu, visited);  
    }
}

public class BFSRecursive {
        
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        int[] visited = new int[6];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.BFS(q, visited);
    }
   
}
