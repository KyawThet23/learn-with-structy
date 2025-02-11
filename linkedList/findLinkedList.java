package linkedList;

public class findLinkedList {
    public static void main(String[] args) {

        Node<Integer> a = new Node<>(10);  
        Node<Integer> b = new Node<>(20); 
        Node<Integer> c = new Node<>(30);
        
        a.next = b;
        b.next = c;

        System.out.println(solution(a,30));
    }   
    private static <T> boolean solution(Node<T> head,T target){
        Node current = head;
        while (current != null) {
            if(current.value == target){
                return true;
            }
            current = current.next;
        }
        return false;
    } 
}

class Node<T> {

    T value;
    Node next;

    public Node(T value){
        this.value = value;
        this.next = null;
    }
}