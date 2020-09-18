package search.testdome;

import java.util.*;

class MyNode {
    public int value;
    public MyNode left, right;

    public MyNode(int value, MyNode left, MyNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTreeCollections {

    public static boolean contains(MyNode root, int value) {

        Queue<MyNode> nodes = new ArrayDeque<MyNode>();

        List<MyNode> visited = new ArrayList<MyNode>();

        nodes.add(root);

        while (!nodes.isEmpty()){
            MyNode actual=nodes.poll();
            visited.add(actual);
            if (actual.value == value ){
                return true;
            }
            if ( value<actual.value && actual.left != null && !visited.contains(actual.left)){
                nodes.add(root.left);
            }
            if (value>actual.value && actual.right != null && !visited.contains(actual.right)){
                nodes.add(root.right);
            }
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