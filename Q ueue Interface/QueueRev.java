import java.util.*;

import javax.xml.transform.Source;

public class QueueRev {
    
    public static void main(String[] args) {
        Queue <Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack <Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        
    }
}
