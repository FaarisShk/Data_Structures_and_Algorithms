import java.util.ArrayList;
import java.util.Stack;

public class GraphCycleDetection {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    private static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph[2].add(new Edge(2, 3));
        // // 3 Edge
        // graph[3].add(new Edge(3, 1));

        // // 4 Edge
        // graph[4].add(new Edge(4, 0));
        // graph[4].add(new Edge(4, 1));

        // // 5 Edge
        // graph[5].add(new Edge(5, 0));
        // graph[5].add(new Edge(5, 2));

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    // 1 -> Cycle Detection in Directed Graph
    public static boolean isCycleDirected(ArrayList<Edge> graph[], int curr, boolean vis[], boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.dest]) { // cycle
                return true;
            } else if (!vis[e.dest] && isCycleDirected(graph, e.dest, vis, rec)) {
                return true;
            }
        }

        rec[curr] = false;
        return false;
    }

    // 2 -> Topological Sort

    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, stack);
            }
        }

        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[], int V) {
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSortUtil(graph, i, vis, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            if (!stack.isEmpty()) {
                System.out.print(" -> ");
            }
        }
        System.out.println(); // Add a newline after printing the topological order.
    }

    // 3 -> Cycle Detection in Undirected Graph

    public static boolean isCycleUnDirected(ArrayList<Edge> graph[], int curr, int par, boolean vis[]) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (vis[e.dest] && e.dest != par) {
                return true;
            } else if (!vis[e.dest]) {
                if (isCycleUnDirected(graph, e.dest, curr, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];

        boolean vis[] = new boolean[V];
        // boolean rec[] = new boolean[v];
        createGraph(graph);
        // System.out.println(isCycleDirected(graph, 0, vis, rec));

        // topSort(graph, V);

        System.out.println(isCycleUnDirected(graph, 0, -1, vis));
    }
}
