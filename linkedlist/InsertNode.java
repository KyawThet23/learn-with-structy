package linkedlist;

public class InsertNode {
    public static void main(String[] args) {
        var a = new Node<>(1);
        var b = new Node<>(2);
        var c = new Node<>(4);
        var d = new Node<>(5);
        a.next = b;
        b.next = c;
        c.next = d;
//        var head = insertIterative(a,3,2);
//        while (head != null) {
//            System.out.print(head.value + " -> ");
//            head = head.next;
//        }
        System.out.println();
        var head2 = insertRecursive(a,3,2,0);
        while (head2 != null) {
            System.out.print(head2.value + " -> ");
            head2 = head2.next;
        }
    }
    private static Node<Integer> insertIterative(Node<Integer>head,int value,int index){
        // 1 -> 2 -> 4 -> 5
        // 1 -> 2 -> 3 -> 4 -> 5
        Node<Integer> insert = new Node<>(value);
        Node<Integer> current = head;
        Node<Integer> prev = null;
        int counter = 0;
        while (current != null){
            if(index == 0){
                insert.next = current;
            }
            if (counter == index){
                prev.next = insert;
                insert.next = current;
            }
            prev = current;
            current = current.next;
            counter++;
        }
        return head;
    }
    private static Node<Integer> insertRecursive(Node<Integer>head,int value,int index,int count){
        // 1 -> 2 -> 4 -> 5
        // 1 -> 2 -> 3 -> 4 -> 5
        Node<Integer> insert = new Node<>(value);
        if(head == null) return null;
        if(index == 0){
          insert.next = head;
        }
        if(index == count){
            var temp = head.next;
            head.next = insert;
            head.next.next = temp;
        }
        insertRecursive(head.next,value,index,count++);
        return head;
    }
}
