import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAglorithm {
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

    static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int node, int dist){
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p1){
            return this.dist - p1.dist;
        }
    }

     public static void createGraph(ArrayList<Edge>[]graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 Edge
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        //1 Edge
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        //2 Edge
        graph[2].add(new Edge(2, 4, 3));

        //3 Edge
        graph[3].add(new Edge(3, 5, 1));

        //4 Edge    
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static void Dikstras(ArrayList<Edge> graph[], int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];

        for(int i=0; i<V; i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean vis[] = new boolean[V];
        pq.add(new Pair(0, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;

                    if(dist[u] + e.wght < dist[v]){
                        dist[v] = dist[u] + e.wght;
                        pq.add(new Pair(v, dist[v]));   
                    }
                }
            }
        }

        for(int i=0; i<V; i++){
            System.out.print(dist[i] + " ");
        } 
        System.out.println();
    }

    public static void main(String[]args){
        int V=6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        Dikstras(graph, 0, V);
    }
}
