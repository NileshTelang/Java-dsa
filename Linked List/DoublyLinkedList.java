public class DoublyLinkedList {
    
    class Node {
        int data ;
        Node next ;
        Node prev ;

        public Node (int data){
            this.data = data ;
            this.next = null;
            this.prev = null ;
        }
    }

    public static Node head ;
    public static Node tail ;
    public static int size ;

    //add
    public void addAtFirst(int data){ //O(1)
        Node newnode = new Node (data);
        size++;
        if(head == null){
            head = tail = newnode ;
            return;
        }
        newnode.next = head ;
        head.prev = newnode ;
        head = newnode ;
    }

    public void addAtLast(int data){ //O(1)
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode ;
            return;
        }
        tail.next = newnode ;
        newnode.prev = tail ;
        tail = newnode ;
    }

    public void addInMiddle(int idx ,int data){
        if(idx == 0){
            addAtFirst(data);
            return;
        }
        if(idx > size){
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head  ;
        int i =0 ;
        while(i < idx-1){
            temp = temp.next ;
            i++;
        }

        //i = idx-1
        newnode.next = temp.next ;
        temp.next = newnode ;
        newnode.prev = temp ;
        temp.next.prev = newnode;
    }

    //remove
    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList Is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null ;
            size = 0;
            return val ;
        }
        int val = head.data ;
        head = head.next ;
        head.prev = null ;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList Is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null ;
            size = 0;
            return val ;
        }

        Node temp = head ;
        for(int i =0;i<size-2;i++){
            temp = temp.next;
        }
        int val = tail.data ;
        temp.next = null ;
        tail.prev = null ;
        size--;
        return val;
    }

    public int removeInMiddle(int idx){
        if(idx == 0){
            return removeFirst() ;
        }else if(idx > size){
            return -1;
        }
        Node temp = head  ;
        int i =0 ;
        while(i < idx-1){
            temp = temp.next ;
            i++;
        }


        //i = idx-1
        int val = temp.next.data;
        temp.next = temp.next.next ;
        temp.next.next.prev = temp;
        size--;
        return val;
    }

    //reverse
    public void reverseDll(){
        Node pre = null ;
        Node curr = head ;
        Node nex ;
        while(curr != null){
            nex = curr.next ;
            curr.next = pre ;
            curr.prev = nex;

            pre = curr ;
            curr= nex ; 
        }

        head = pre ;
    }

    public static void printll(DoublyLinkedList ll){//O(n)
        Node temp = head ;
        if(head == null){
            System.out.println("Linked List Is Empty .");
        }
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next ;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList() ;

        dll.addAtFirst(0);
        dll.addAtLast(1);
        dll.addInMiddle(2, 2);
        dll.printll(dll);

        // dll.removeFirst();
        // dll.removeLast();
        // dll.removeInMiddle(2);
        // dll.printll(dll);

        dll.reverseDll();
        dll.printll(dll);
    }
}
