package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeMinValue {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(2);
        Node<Integer> b = new Node<>(3);
        Node<Integer> c = new Node<>(4);
        Node<Integer> d = new Node<>(1);
        Node<Integer> e = new Node<>(5);
        Node<Integer> f = new Node<>(2);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        //      a
        //    /   \
        //   b     c
        //  / \     \
        // d   e     f

        System.out.println(minValue(a)); // d
        System.out.println(minValueIterative(a)); // d
    }

    private static int minValue(Node<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val, Math.min(minValue(root.left), minValue(root.right)));
    }
    private static int minValueIterative(Node<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        int min = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Node<Integer> node = queue.remove();
            min = Math.min(min, node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return min;
    }
}
