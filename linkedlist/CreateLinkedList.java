package linkedlist;

import java.util.List;

public class CreateLinkedList {
    public static void main(String[] args) {
        Node<String> head2 = createRecursive(List.of("q","w","e","r"),0);
        while (head2 != null) {
            System.out.print(head2.value + " -> ");
            head2 = head2.next;
        }
    }
    private static Node<String> create(List<String> list){
        Node<String> dummyHead = new Node<>("");
        Node<String> tail = dummyHead;
        for (String i : list){
            Node<String> temp = new Node<>(i);
            tail.next = temp;
            tail = temp;
        }
        return dummyHead.next;
    }
    public static <T> Node<T> createRecursive(List<T> list,int index){
        if (list.size() <= index) return null;
        var current = new Node<>(list.get(index));
        current.next = createRecursive(list,index+1);
        return current;
    }
}
