

public class QueueLL {

    static class Node {
        int data ;
        Node next ;
        Node (int data){
            this.data = data ;
            this.next = null ;
        }
    }

    static class Queue {

        public static Node head ;
        public static Node tail ;

        // isEmpty
        public static boolean isEmpty(){
            return head == null && tail == null ;
        }

        // add
        public static void enq(int data){//O(1)
            Node newnode = new Node(data);
            if(head == null){
                head = tail = newnode;
                return ;
            }
            tail.next = newnode;
            tail = newnode ; 
        }

        // remove
        public static int deq(){//O(n)
            if(isEmpty()){
                System.out.println("Queue isEmpty");
                return -1;
            }

            int front = head.data ;
            if(head == tail){
                head = tail = null ;
            }else {
                head = head.next ;
            }
            return front ;
        }

        // peek
        public static int peek(){//O(1)
            if(isEmpty()){
                System.out.println("Queue isEmpty");
                return -1;
            }

            return head.data ;
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