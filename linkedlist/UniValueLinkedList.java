package linkedlist;

public class UniValueLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);

        System.out.println(uniValue(head));
    }
    public static boolean uniValue(Node<Integer> head){

        boolean result = true;
        int unique = head.value;
        Node<Integer> current = head;

        while (current != null){
            result = unique == current.value;
            current = current.next;
        }
        return result;
    }
}
