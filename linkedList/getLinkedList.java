package linkedList;

public class getLinkedList {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(10);  
        Node<Integer> b = new Node<>(20); 
        Node<Integer> c = new Node<>(30);
        
        a.next = b;
        b.next = c;
        System.out.println(solution(a, 2));
    }

    private static <T> T solution(Node<T> head, int index) {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            if (count == index) {
                return current.value;
            }
            current = current.next;
            count += 1;
        }
        return null;
    }

}

class Node<T> {

    T value;
    Node next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}
