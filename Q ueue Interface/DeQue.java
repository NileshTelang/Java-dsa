import java.util.*;
import java.util.LinkedList;

public class DeQue {
    
    public static void main(String[] args) {
        Deque <Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
        dq.getFirst();
        System.out.println(dq.getLast());
    }
}
