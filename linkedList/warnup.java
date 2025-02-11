package linkedList;

import org.w3c.dom.Node;

public class warnup {

    public static void main(String[] args) {

        Node<Integer> a = new Node<>(10);  
        Node<Integer> b = new Node<>(20); 
        Node<Integer> c = new Node<>(30);
        
        a.next = b;
        b.next = c;
        System.out.println(a.next.value);
    }

    private static void list(Node head){
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}

class Node<T> {

    T value;
    Node next;

    public Node(T value){
        this.value = value;
        this.next = null;
    }
}
