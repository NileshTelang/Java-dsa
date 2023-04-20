import java.util.*;

public class QueueStack {

    static class Queue {

        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<>();

        // isEmpty
        public static boolean isEmpty(){
            return s1.isEmpty() ;
        }

        // enq
        public static void enq(int data){//O(n)
            //s1 empty nahi to s2 main push
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            //else push in s1
            s1.push(data);
            //pushed ele in s2 -> s1
            while(!s2.empty()){
                s1.push(s2.pop());
            }
        }

        // deq
        public static int deq(){//O(1)
            if(isEmpty()){
                System.out.println("Queue isEmpty");
                return -1;
            }
            
            return s1.pop() ;
        }

        // peek
        public static int peek(){//O(1)
            if(isEmpty()){
                System.out.println("Queue isEmpty");
                return -1;
            }

            return s1.peek() ;
        }
    }
    
    public static void main(String[] args) {
        Queue q =new Queue();
        q.enq(0);
        q.enq(1);
        q.enq(2);
        q.enq(3);
        q.enq(4);
        q.deq();
        q.enq(5);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.deq();
        }
    }
}
