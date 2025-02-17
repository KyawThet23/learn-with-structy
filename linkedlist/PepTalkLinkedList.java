package linkedlist;

public class PepTalkLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        System.out.println("Original List:");
        printList(head);

        // Modify the list
        head = pepTalk(head);

        System.out.println("Modified List:");
        printList(head);
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    private static Node<Integer> pepTalk(Node<Integer> head){

        // 1 -> 2 -> 3 -> 4 -> 5
        // 1 -> 3 -> 5 -> 2 -> 4

        Node<Integer> oddHead = head;
        Node<Integer> evenHead = head.next;
        Node<Integer> oddTail = oddHead;
        Node<Integer> evenTail = evenHead;
        Node<Integer> current = head.next;
        int counter = 1;

        while (current != null){
            if(counter % 2 != 0){
                oddTail.next = current.next;
                oddTail = oddTail.next;
            }else {
                evenTail.next = current.next;
                evenTail = evenTail.next;
            }
            current = current.next;
            counter++;
        }

        if (current == null) oddTail.next = evenHead ;
        return head;
    }
}
