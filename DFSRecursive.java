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

    void DFS(int start, int[] visited) {
        visited[start] = 1;
        System.out.println(start);
        for(int i=0;i<edges[start].size();i++) {
            int curr = edges[start].get(i);
            if (visited[curr] != 1) {
                DFS(curr, visited);
            }
        }
    }
}

public class DFSRecursive {
        
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        int[] visited = new int[6];
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.DFS(0, visited);
    }
   
}
