package linkedlist;

import java.util.List;

public class AddLinkedList {
    public static void main(String[] args) {
        Node<Integer> head1 = CreateLinkedList.createRecursive(List.of(9,2,1),0);
        Node<Integer> head2 = CreateLinkedList.createRecursive(List.of(9,8,1),0);
        Node<Integer> head = add(head1,head2);
        while (head != null){
            System.out.print(head.value + " -> ");
            head = head.next;
        }
    }
    public static Node<Integer> add(Node<Integer> head1, Node<Integer> head2){
        Node<Integer> current1 = head1;
        Node<Integer> current2 = head2;
        Node<Integer> head = new Node<>(null);
        Node<Integer> tail = head;
        int carry = 0;

        while (current1 != null || current2 != null || carry == 1){
            var val1 = current1 != null ? current1.value : 0;
            var val2 = current2 != null ? current2.value : 0;

            var sum = val1 + val2 + carry; //11
            var remainder = sum % 10; // 2
            carry = sum > 9 ? 1 : 0;

            if (current1 != null) current1 = current1.next;
            if (current2 != null) current2 = current2.next;

            tail.next = new Node<>(remainder);
            tail = tail.next;
        }
        return head.next;
    }
    public static Node<Integer> addRecursive(Node<Integer> head1, Node<Integer> head2,int carry){
        if(head1 == null && head2 == null && carry == 0) return null;
        var val1 = head1 != null ? head1.value : 0;
        var val2 = head2 != null ? head2.value : 0;

        var sum = val1 + val2 + carry; //11
        var remainder = sum % 10; // 2
        carry = sum > 9 ? 1 : 0;

        var result = new Node<>(remainder);

        var next1 = head1 != null ? head1.next : null;
        var next2 = head2 != null ? head2.next : null;

        result.next = addRecursive(next1,next2,carry);
        return result;
    }
}
