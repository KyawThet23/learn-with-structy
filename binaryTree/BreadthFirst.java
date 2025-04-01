package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirst {

    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

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

        System.out.println(breadthFirstValues(a)); // [a, b, c, d, e, f]
    }

    public static List<String> breadthFirstValues(Node<String> root) {
        List<String> values = new ArrayList<>();
        Queue<Node<String>> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Node<String> node = queue.remove();
            values.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return values;
    }
}