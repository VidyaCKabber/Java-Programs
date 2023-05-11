
// Check if an Undirected Graph is a Tree or Not
// Description
// Given a graph with N vertices. Check whether an undirected graph is a tree or not. 

// An undirected graph is tree if it has following properties.

// There is no cycle.
// The graph is connected.
// Another way to understand this is to say that a tree is an undirected graph in which any two vertices are connected by exactly one path.

 

// Input Format:

// The first line contains an integer representing a number N as the number of vertices of the graph.

// The second contains an integer n representing the number of edges in the graph.

// Each next n line will have two space-separated integers, representing two vertices of each edge.

// For example: 

// 1 2 represents an edge from node 1 to node 2.

 

// Output Format:

// Print ‘Yes’ (without quotes and with capital letter ‘Y’) if the graph is a tree, otherwise ‘No’ (without quotes and with capital letter ‘N’).

 

// Sample Test Cases:

// Input:

// 15

// 4

// 11 10

// 10 12

// 10 13

// 13 14

 

// Output:

// No

 

 

// Input:

// 6

// 5

// 1 0

// 0 2  

// 0 3  

// 3 4

// 4 5

 

// Output:

// Yes

import java.util.*;

public class CheckUndirectedGraphIsATreeOrNot {
    private int vertexCount;
    private LinkedList<Integer> adj[];

    Source(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adj = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; ++i) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        if (!isValidIndex(v) || !isValidIndex(w)) {
            return;
        }
        adj[v].add(w);
        adj[w].add(v);
    }

    private boolean isValidIndex(int i) {
        return i >= 0 && i < vertexCount;
    }

    private boolean isCyclic(int v, boolean[] visited, int parent) {
        visited[v] = true;

        for (int neighbor : adj[v]) {
            if (!visited[neighbor]) {
                if (isCyclic(neighbor, visited, v))
                    return true;
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    public boolean isTree() {
        boolean[] visited = new boolean[vertexCount];

        if (isCyclic(0, visited, -1)) {
            return false;
        }

        for (int i = 0; i < vertexCount; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int noOfNodes = scanner.nextInt(); 
        int noOfEdges = scanner.nextInt(); 

        Source graph = new Source(noOfNodes);
        
        for (int i = 0; i < noOfEdges; ++i) {
            graph.addEdge(scanner.nextInt(), scanner.nextInt());
        }
        
        if (graph.isTree()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
