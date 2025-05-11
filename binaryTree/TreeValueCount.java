package binaryTree;

public class TreeValueCount {
    public static void main(String[] args) {
        Node<String> a = new Node<>("f");
        Node<String> b = new Node<>("f");
        Node<String> c = new Node<>("f");
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
        // f f
        // / \ \
        // d e f

        // Deapth First recursive

        System.out.println(counter(a, "f"));
    }

    private static int counter(Node<String> root, String target) {

        if (root == null)
            return 0;
        var count = root.val.equals(target) ? 1 : 0;

        return count + counter(root.left, target) + counter(root.right, target);
    }

    
}
