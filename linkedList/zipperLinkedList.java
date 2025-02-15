package linkedList;

public class zipperLinkedList {

    public static void main(String[] args) {

    }
    private static <T> Node<T> zipperIterative(Node<T> head1 , Node<T> head2){

        // A -> B -> C
        // D -> E -> F
        // A -> D -> B -> E -> C -> F

        Node<T> head = head1;
        Node<T> tail = head;
        Node<T> current1 = head1.next;
        Node<T> current2 = head2;

        int count = 0;
        while (current1 != null && current2 != null) {
          if (count % 2 == 0){
              tail.next = current2;
              current2 = current2.next;
          }else {
              tail.next = current1;
              current1 = current1.next;
          }
          tail = tail.next;
          count ++;
        }

        if (current1 != null){
            tail.next = current1;
        }
        if (current2 != null){
            tail.next = current2;
        }
        return head;
    }

    private static <T> Node<T> zipperRecursive(
            Node<T> head1 ,
            Node<T> head2 ,
            int count
    )
    {
        // A -> B -> C
        // D -> E -> F
        // A -> D -> B -> E -> C -> F

        if(head1 == null) return head2;
        if(head2 == null) return head1;

        if(count % 2 == 0){
            head1.next = zipperRecursive(head1.next,head2,count+1);
            return head1;
        }else {
            head2.next = zipperRecursive(head1,head2.next,count+1);
            return head2;
        }
    }
}
