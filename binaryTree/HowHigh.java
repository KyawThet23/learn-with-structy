package binaryTree;

public class HowHigh {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
        Node<String> g = new Node<>("g");
        Node<String> h = new Node<>("h");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        d.left = g;
        g.left = h;

        // a
        // / \
        // b c
        // / \ \
        // d e f
        // /
        // g
        // /
        // h

        System.out.println(howHigh(a)); // 4    
        System.out.println(howHigh(d)); // 2
    }

    private static int howHigh(Node<String> root) {
        if(root == null)
            return 0;
        var high = (root.left == null && root.right == null) ? 0 : 1;
        return high + Math.max(howHigh(root.left) , howHigh(root.right));
    }

}
