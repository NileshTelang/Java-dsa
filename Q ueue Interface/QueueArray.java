

public class QueueArray{

    // static class Queue {

    //     static int arr[] ;
    //     static int size ;
    //     static int rear ;

    //     Queue(int n){
    //         arr = new int[n];
    //         size = n ;
    //         rear = -1 ;
    //     }

    //     // isEmpty
    //     public static boolean isEmpty(){
    //         return rear == -1 ;
    //     }

    //     // add
    //     public static void enq(int data){//O(1)
    //         if(rear == size -1){
    //             System.out.println("Queue Is Full");
    //         }

    //         rear = rear + 1;
    //         arr[rear] = data; 
    //     }

    //     // remove
    //     public static int deq(){//O(n)
    //         if(isEmpty()){
    //             System.out.println("Queue isEmpty");
    //             return -1;
    //         }

    //         int front = arr[0];
    //         for(int i =0; i<rear;i++){
    //             arr[i] =arr[i+1];
    //         }
    //         rear = rear -1 ;
    //         return front ;
    //     }

    //     // peek
    //     public static int peek(){//O(1)
    //         return arr[0];
    //     }

    //circular q
    static class Queue {

        static int arr[] ;
        static int size ;
        static int rear ;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n ;
            rear = -1 ;
            front = -1;
        }

        // isEmpty
        public static boolean isEmpty(){
            return front == -1 && rear == -1 ;
        }

        // isFull
        public static boolean isFull(){
            return (rear+1)%size == front ;
        }

        // add
        public static void enq(int data){//O(1)
            if(isFull()){
                System.out.println("Queue Is Full");
            }
            if(front == -1){
                front = 0;
            }

            rear = (rear + 1)%size;
            arr[rear] = data; 
        }

        // remove
        public static int deq(){//O(1)
            if(isEmpty()){
                System.out.println("Queue isEmpty");
                return -1;
            }

            int result = arr[front];
            if(rear == front){
                front = rear = -1;
            }else{
                front = (front + 1)%size;
            }
            return result ;
        }

        // peek
        public static int peek(){//O(1)
            if(isEmpty()){
                System.out.println("Queue isEmpty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        
        Queue q =new Queue(5);
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