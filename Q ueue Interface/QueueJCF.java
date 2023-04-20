import java.util.*;
import java.util.LinkedList;

public class QueueJCF {
    
    public static void main(String[] args) {
        // Queue <Integer> q = new LinkedList<>();
        Queue <Integer> q = new ArrayDeque<>();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(5);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
