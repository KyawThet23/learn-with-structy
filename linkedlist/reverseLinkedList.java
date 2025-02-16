package linkedlist;

public class reverseLinkedList {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(10);  
        Node<Integer> b = new Node<>(20); 
        Node<Integer> c = new Node<>(30);
        Node<Integer> d = new Node<>(40); 
        Node<Integer> e = new Node<>(50);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(reverse(a));
    }

    private static <T> Node<T> reverse(Node<T> head){

        // null -> 10 -> 20 -> 30 -> 40 -> 50
        // null -> 50 -> 40 -> 30 -> 20 -> 10
        Node<T> previous = null;
        Node<T> current = head;

        while (current != null){
            Node<T> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    
}
