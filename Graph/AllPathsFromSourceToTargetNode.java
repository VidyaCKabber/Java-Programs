Given a directed acyclic graph (DAG) of n nodes labelled from 0 to n - 1, count all possible paths from node 0 to node n - 1, and return the number of paths.



// The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e. , there is a directed edge from node i to node graph[i][j]).



// Example:





// Input:

// If graph = [[1,2],[3],[3],[]], the input can be taken as follows:



// first line: (number of nodes) 4

// second line: (nodes you can visit from first node) 1 2

// third line: (nodes you can visit from second node) 3

// fourth line: (nodes you can visit from third node) 3

// fifth line:( nodes you can visit from fourth node) -1



// Note: input -1 implies no node can be visited from the given node.



// Output: 2

// Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
  
  import java.util.*;

public class Source {
    public static int countPaths(int[][] graph, int source, int target) {
        int[] dp = new int[graph.length];
        Arrays.fill(dp, -1);
        return dfs(graph, source, target, dp);
    }

    public static int dfs(int[][] graph, int node, int target, int[] dp) {
        if (node == target) {
            return 1;
        }

        if (dp[node] != -1) {
            return dp[node];
        }

        int count = 0;
        for (int nextNode : graph[node]) {
            count += dfs(graph, nextNode, target, dp);
        }

        dp[node] = count;
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of nodes
        scanner.nextLine();

        int[][] graph = new int[n][];
        for (int i = 0; i < n; i++) {
            String[] nodes = scanner.nextLine().split(" ");
            graph[i] = new int[nodes.length];
            for (int j = 0; j < nodes.length; j++) {
                graph[i][j] = Integer.parseInt(nodes[j]);
            }
        }

        int result = countPaths(graph, 0, n - 1);
        System.out.println(result);
    }
}
