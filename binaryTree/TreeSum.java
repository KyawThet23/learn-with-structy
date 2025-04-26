package binaryTree;

public class TreeSum {
    
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(5);
        Node<Integer> f = new Node<>(6);

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

        System.out.println(sumTree(a)); // 21
    }
    
    public static int sumTree(Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        return root.val + sumTree(root.left) + sumTree(root.right);
    }
}
