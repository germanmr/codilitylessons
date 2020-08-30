package search;

public class BinaryTree {

//    Node root;
//
//    public void add(int value) {
//        root = addRecursive(root, value);
//    }
//
//    /**
//     * Insertion of a Node!
//     *
//     * @param current
//     * @param value
//     * @return
//     */
//    private Node addRecursive(Node current, int value) {
//        if (current == null) {
//            return new Node(value);
//        }
//
//        // We have to go left or right in
//        // the nodes with each comparation!
//        if (value < current.value) {
//            current.left = addRecursive(current.left, value);
//        } else if (value > current.value) {
//            current.right = addRecursive(current.right, value);
//        } else {
//            return current;
//        }
//
//        return current;
//    }
//
//    private boolean containsNodeRecursive(Node current, int value) {
//        if (current == null) {
//            return false;
//        }
//        if (value == current.value) {
//            return true;
//        }
//        return value < current.value
//                ? containsNodeRecursive(current.left, value)
//                : containsNodeRecursive(current.right, value);
//    }
//
//    public boolean containsNode(int value) {
//        return containsNodeRecursive(root, value);
//    }
//
//    private Node deleteRecursive(Node current, int value) {
//        if (current == null) {
//            return null;
//        }
//
//        if (value == current.value) {
//            // Node to delete found
//            // ... code to delete the node will go here
//        }
//        if (value < current.value) {
//            current.left = deleteRecursive(current.left, value);
//            return current;
//        }
//        current.right = deleteRecursive(current.right, value);
//        return current;
//    }

}