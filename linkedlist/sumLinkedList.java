package linkedlist;

public class sumLinkedList {

    public static void main(String[] args) {

        Node<Integer> a = new Node<>(10);  
        Node<Integer> b = new Node<>(20); 
        Node<Integer> c = new Node<>(30);
        
        a.next = b;
        b.next = c;

        System.out.println(solution(a));
    }

    private static int solution(Node<Integer> head){

        if(head == null){
            return 0;
        }
        return head.value + solution(head.next);
    }
    
}