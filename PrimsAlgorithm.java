import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    static class Edge{
        int src;
        int dest;
        int wght;

        Edge(int src, int dest, int wght){
            this.src = src;
            this.dest = dest;
            this.wght = wght;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int V){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        //0 Edge
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        // 1 Edge
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        // 2 Edge
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        // 3 Edge
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    static class Pair implements Comparable<Pair>{
        int node;
        int wght;

        Pair(int node, int wght){
            this.node = node;
            this.wght = wght;
        }

        public int compareTo(Pair p1){
            return this.wght - p1.wght;
        }
    }

    public static void Prims(ArrayList<Edge> graph[], int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[V];

        pq.add(new Pair(0, 0));
        int mst = 0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                mst += curr.wght;
                
                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wght));
                    }
                }
            }
        } System.out.println(mst);
    }

    public static void main(String[]args){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        Prims(graph, V);
    }
}
