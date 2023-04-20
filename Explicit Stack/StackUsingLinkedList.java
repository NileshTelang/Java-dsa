

import java.util.LinkedList;

public class StackUsingLinkedList {

    static class Stack {
        static LinkedList <Integer> list = new LinkedList<>();
        //isEmpty
        public static boolean isEmpty(){ //O(1)
            return list.size() == 0 ;
        }

        //push
        public static void push(int data){ //O(1)
            list.addFirst(data);
        }

        //pop
        public static int pop(){ //O(1)
            return list.removeFirst() ;
        }

        //peek
        public static int peek(){ //O(1)
            return list.getFirst();
        }

    }
    

    public static void main(String[] args) {

        Stack s = new Stack() ;
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        
    }
}

