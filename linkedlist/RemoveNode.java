package linkedlist;

public class RemoveNode {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(1);
        a.next = new Node<>(2);
        a.next.next = new Node<>(3);
        a.next.next.next = new Node<>(4);
        a.next.next.next.next = new Node<>(5);
        Node<Integer> head = removeIterative(a,1);
        while (head != null){
            System.out.print(head.value + " -> ");
            head = head.next;
        }
    }

    private static Node<Integer> removeIterative(Node<Integer> head,int target){

        // 1 -> 2 -> 3 -> 4 -> 5
        if(head.value == target) return head.next ;
        Node<Integer> prev = null;
        Node<Integer> current = head;

        while (current != null){
            if(current.value == target){
                prev.next = current.next;
             break;
            }
            prev = current;
            current = current.next;
        }
        return head;
    }

    private static Node<Integer> removeRecursive(Node<Integer> head,int target){
        if(head == null) return null ;
        if(head.value == target) return head.next;
        head.next = removeRecursive(head.next,target);
        return head;
    }
}
