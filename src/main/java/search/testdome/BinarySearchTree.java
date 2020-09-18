package search.testdome;

class Node {
    public int value;
    public MyNode left, right;

    public Node(int value, MyNode left, MyNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {

    public static boolean contains(MyNode root, int value) {

        if (root.value==value){
            return true;
        }
        if (root.left != null && value<root.value){
            if (contains(root.left, value))return true;
        }

        if (root.right != null && value>root.value){
            if (contains(root.right, value))return true;
        }

        return false;

    }

    public static void main(String[] args) {
        MyNode n1 = new MyNode(1, null, null);
        MyNode n3 = new MyNode(3, null, null);
        MyNode n2 = new MyNode(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}