package linkedlist;

public class LongestStreakLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next.next = new Node(3);

        System.out.println(longestStreak(head));
    }
    private static int longestStreak(Node<Integer> head){

        // 2 -> 2 -> 2 -> 3 -> 3 -> 4 -> 4 -> 4 -> 4

        int max_streak = 0;
        int current_streak = 0;
        int prev = head.value;
        Node<Integer> current = head;

        while (current != null){
            if (prev == current.value){
                current_streak++;
            }else{
                prev = current.value;
                current_streak = 1;
            }
            if(max_streak < current_streak) max_streak = current_streak;
            current = current.next;
        }
        return max_streak;
    }
}
