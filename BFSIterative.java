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

    void BFS(int start) {
        int visited[] = new int[nodes];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start]=1;

        while(!queue.isEmpty()) {
            start = queue.poll();
            System.out.print(start + "\n");
            for(int i=0;i<edges[start].size();i++) {
            	int curr = edges[start].get(i);
            	if (visited[curr] != 1) {
	                queue.add(curr);
	                visited[curr]=1;
            	}
            }
    	}
	}
}

public class BFSIterative {
        
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(2,3);

        graph.BFS(1);
    }
   
}
