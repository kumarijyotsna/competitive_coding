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

    void DFS(int start) {
        int visited[] = new int[nodes];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while(!stack.isEmpty()) {
            //System.out.println(stack);
            start = stack.peek();
            stack.pop();
            System.out.print(start + "\n");
            visited[start] = 1;
            for(int i=0;i<edges[start].size();i++) {
            	int curr = edges[start].get(i);
            	if (visited[curr] != 1) {
	                stack.push(curr);
            	}
            } 
    	}
	}
}

public class DFSIterative {
        
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.addEdge(3,4);
        graph.addEdge(1,4);
        graph.DFS(0);
    }
   
}
