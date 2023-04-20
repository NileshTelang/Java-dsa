import java.util.*;
import java.util.LinkedList;

public class StackQueue {

    static class Stack {

        static Queue <Integer> q1 = new LinkedList<>();
        static Queue <Integer> q2 = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty() ;
        }

        // push
        public static void push(int data){//O(1)
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        // pop
        public static int pop(){//O(n)
            if(isEmpty()){
                System.out.println("Queue isEmpty");
                return -1;
            }
            int top = -1;

            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            //case 2
            else if(!q2.isEmpty()){
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top ;
        }

        // peek
        public static int peek(){//O(1)
            if(isEmpty()){
                System.out.println("Queue isEmpty");
                return -1;
            }
            int top = -1;

            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }
            //case 2
            else if(!q2.isEmpty()){
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top ;
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
