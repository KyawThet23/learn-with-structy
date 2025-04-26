package binaryTree;

public class TreeIncludes {

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

        System.out.println(new TreeIncludes().includes(a, "e")); // true
        System.out.println(new TreeIncludes().includes(a, "g")); // false
    }

    private boolean includes(Node<String> root, String value) {
        if (root == null) {
            return false;
        }
        if (root.val.equals(value)) {
            return true;
        }
        return includes(root.left, value) || includes(root.right, value);
    }
    
}
