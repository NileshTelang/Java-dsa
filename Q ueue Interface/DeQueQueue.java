import java.util.*;
import java.util.LinkedList;

public class DeQueQueue {

    static class Stack {
        static Deque<Integer> dq = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty() {
            return dq.isEmpty();
        }

        // enq
        public static void enq(int data) {// O(1)
            dq.addLast(data);
        }

        // deq
        public static int deq() {// O(1)

            return dq.remove();
        }

        // peek
        public static int peek() {// O(1)

            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        Stack q = new Stack();
        q.enq(0);
        q.enq(1);
        q.enq(2);
        q.enq(3);
        q.enq(4);
        q.deq();
        q.enq(5);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.deq();
        }
    }
}
