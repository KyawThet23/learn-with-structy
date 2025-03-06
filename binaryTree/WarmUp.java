package binaryTree;

public class WarmUp {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.left = b;
        a.right = c;
        b.left = d;
    }
}
