package sortingalgorithms;


import java.util.LinkedList;
import java.util.List;

public class GraphExample {

//    public static void main(String[] args) {
//
//        Graph graph=new Graph(10);
//        graph.addEdge(0,2,10);
//        graph.addEdge(0,5,15);
//        graph.addEdge(0,5,10);
//        graph.addEdge(0,3,16);
//
//        System.out.println(graph);
//        System.out.println(graph.isConnected(9,3));
//
//    }
//
//}
//
//class Graph {
//
//    List<Edge> G[];
//
//    public Graph(int n) { // Number of nodes
//        G = new LinkedList[n];
//        for (int i = 0; i < G.length; i++)
//            G[i] = new LinkedList();
//    }
//    boolean isConnected(int u,int v){
//        for (Edge i: G[u])
//            if(i.v==v) return true;
//        return false;
//    }
//    void addEdge(int u,int v,int w){
//        G[u].add(0, new Edge(v,w));
//    }
//    @Override
//    public String toString() {
//        String result="";
//        for(int i=0;i<G.length;i++)
//            result+=i+"=>"+G[i]+"\n";
//        return result;
//    }
//
//    class Edge {
//        int v, w;
//        public Edge(int v, int w) {
//            this.v = v;this.w = w;
//        }
//        @Override
//        public String toString() {
//            return "{" + v + "," + w + "}";
//        }
//    }
}
