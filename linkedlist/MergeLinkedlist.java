package linkedlist;

public class MergeLinkedlist {

    public static void main(String[] args) {
        Node<Integer> list1 = new Node<>(1);
        list1.next = new Node<>(3);
        list1.next.next = new Node<>(5);

        Node<Integer> list2 = new Node<>(2);
        list2.next = new Node<>(4);
        list2.next.next = new Node<>(6);

        Node<Integer> mergedList = merge(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.value + " ");
            mergedList = mergedList.next;
        }
    }
    public static Node<Integer> merge(Node<Integer> node1 , Node<Integer> node2){

        Node<Integer> dummy = new Node<>(0);
        Node<Integer> tail = dummy;

        Node<Integer> current1 = node1;
        Node<Integer> current2 = node2;

        while (current1 != null && current2 != null) {
            if (current1.value < current2.value) {
                tail.next = current1;
                current1 = current1.next;
            } else {
                tail.next = current2;
                current2 = current2.next;
            }
            tail = tail.next;
        }
        if (current1 == null){
            tail.next = current2;
        }
        if (current2 == null){
            tail.next = current1;
        }
        return dummy.next;
    }
}
