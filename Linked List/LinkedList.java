

public class LinkedList {


    public static class Node {
        int data ;
        Node next ;

        public Node (int data){
            this.data = data ;
            this.next = null ;
        }
    }

    public static Node head ; 
    public static Node tail ;
    public static int size ;

    //add
    public static void addAtFirst(int data){ //O(1)
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode ;
            return;
        }
        newnode.next = head ;
        head = newnode ;
    }

    public static void addAtLast(int data){ //O(1)
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode ;
            return;
        }
        tail.next = newnode ;
        tail = newnode ;
    }

    public void addInMiddle(int idx ,int data){
        if(idx == 0){
            addAtFirst(data);
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
        size--;
        return val;
    }

    public int removeInMiddle(int idx){
        if(idx == 0){
            return removeFirst() ;
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
        size--;
        return val;
    }

    //Search
    public static int itrSearch(int key){ //O(n)
        Node temp = head ;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            i++;
            temp = temp.next ;
        }

        return -1;
    }

    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1 ; // + 1 bcz original head is outside the recursion
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    //reverse
    public static void reverseLL(){ //O(n)
        Node prev = null ;
        Node curr = tail = head ;
        Node next ;

        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }

        head = prev ;
    }

    public static void printll(LinkedList ll){//O(n)
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
        
        //intialize
        LinkedList ll = new LinkedList() ;

        //add
        printll(ll);
        addAtFirst(2);
        printll(ll);
        addAtFirst(1);
        printll(ll);
        addAtLast(3);
        printll(ll);
        addAtLast(4);
        addAtLast(5);
        addAtLast(6);
        addAtLast(7);
        printll(ll);
        ll.addInMiddle(0, 0); //non-static method
        printll(ll);
        System.out.println("Size Of LinkedList -> "+ll.size);  
        
        //remove
        System.out.println("Removing - "+ll.removeFirst());
        printll(ll);
        System.out.println("Removing - "+ll.removeLast());
        printll(ll);
        System.out.println("Removing - "+ll.removeInMiddle(1));
        printll(ll);
        System.out.println("Size Of LinkedList -> "+ll.size);

        //itrSearch
        System.out.println("Key Found At -> "+itrSearch(4));
        System.out.println("Key Found At -> "+ll.recSearch(4));

        //reverse
        reverseLL();
        printll(ll);
    }
}