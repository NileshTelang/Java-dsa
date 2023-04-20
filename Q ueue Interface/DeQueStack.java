import java.util.*;
import java.util.LinkedList;

public class DeQueStack {

    static class Stack {
        static Deque <Integer> dq =new LinkedList<>();

        public static boolean isEmpty(){
            return dq.isEmpty();
        }
        // push
        public static void push(int data) {// O(1)
            dq.addLast(data);
        }

        // pop
        public static int pop() {// O(1)

            return dq.removeLast();
        }

        // peek
        public static int peek() {// O(1)
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack q =new Stack();
        q.push(0);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.pop();
        q.push(5);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.pop();
        }
    }
}
