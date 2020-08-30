package search;

import java.util.*;

public class Node<T> {
//    private T value;
//    private Set<Node<T>> neighbors;
//
//    public Node(T value) {
//        this.value = value;
//        this.neighbors = new HashSet<>();
//    }
//
//    public void connect(Node<T> node) {
//        if (this == node) throw new IllegalArgumentException("Can't connect node to itself");
//        this.neighbors.add(node);
//        node.neighbors.add(this);
//    }
//
//    public T getValue() {
//        return value;
//    }
//
//    public Set<Node<T>> getNeighbors() {
//        return neighbors;
//    }
//
//    Set<Node<T>> alreadyVisited = new HashSet<>();
//
//    public static <T> Optional<Node<T>> search(T value, Node<T> start) {
//        Queue<Node<T>> queue = new ArrayDeque<>();
//        queue.add(start);
//
//        Node<T> currentNode;
//
//        while (!queue.isEmpty()) {
//            currentNode = queue.remove();
////            LOGGER.info("Visited node with value: {}", currentNode.getValue());
//
//            if (currentNode.getValue().equals(value)) {
//                return Optional.of(currentNode);
//            } else {
//                alreadyVisited.add(currentNode);
//                queue.addAll(currentNode.getNeighbors());
//                queue.removeAll(alreadyVisited);
//            }
//        }
//
//        return Optional.empty();
//    }
}