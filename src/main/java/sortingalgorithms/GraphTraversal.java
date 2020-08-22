package sortingalgorithms;

import java.util.*;


public class GraphTraversal {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("H");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");
        graph.addEdge("F", "H");
        System.out.println( breadthFirstTraversalTiers(graph,"A").toString());

    }

    static Set<String> breadthFirstTraversalTiers(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        Map<Integer, List<String>> tiers=new HashMap<>();
        queue.add(root);
        visited.add(root);
        int tier=1;
        tiers.put(tier,new ArrayList());
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Graph.Vertex v : graph.getAdjVertices(vertex)) {
                // Not visited and not in the tiers
                if (!visited.contains(v.label) && !tiers.get(tier).contains(v.label)) {
                //if (!tiers.get(vertex).contains(v.label)) {
                    visited.add(v.label);
                    tiers.get(tier).add(0,v.label);
                    queue.add(v.label);
                }
            }
            tier++;
            // we have to add the if non elements exists
            if (tiers.get(tier)==null){
                tiers.put(tier,new ArrayList());
            }
//            tiers.put(tier,new ArrayList(queue));
//            tiers.put(tier,new ArrayList());
        }
        return visited;
    }


    static Set<String> depthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Graph.Vertex v : graph.getAdjVertices(vertex)) {
                    stack.push(v.label);
                }
            }
        }
        return visited;
    }

    static Set<String> breadthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Graph.Vertex v : graph.getAdjVertices(vertex)) {
                if (!visited.contains(v.label)) {
                    visited.add(v.label);
                    queue.add(v.label);
                }
            }
        }
        return visited;
    }
}