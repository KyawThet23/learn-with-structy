package binaryTree;
import java.util.ArrayList;
import java.util.List;

public class TreePathFinder {
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

        // a
        // / \
        // b c
        // / \ \
        // d e f

        // Deapth First recursive

        System.out.println(findPath(a, "f")); // [1, 2, 5]
    }

    private static List<String> findPath(Node<String> root, String target) {

        if (root == null)
            return null;
        if (root.val.equals(target)) return new ArrayList<>(List.of(root.val));

        List<String> leftPath = findPath(root.left, target);
        if (leftPath != null) {
            leftPath.add(root.val);
            return leftPath;
        }

        List<String> rightPath = findPath(root.right, target);
        if (rightPath != null) {
            rightPath.add(root.val);
            return rightPath;
        }
        return null;
    }
}
