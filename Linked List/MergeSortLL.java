import javax.xml.transform.Source;

public class MergeSortLL {


    class Node{
        int data ;
        Node next ;

        public Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }

    public static Node head ;
    public static Node tail ;
    public static int size ;

    public void addLast(int data){ //O(1)
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode ;
            return;
        }
        tail.next = newnode ;
        tail = newnode ;
    }

    public Node getMidNode(Node head){
        Node turtle = head;
        Node hare = head.next ;

        while(hare != null && hare.next != null){
            turtle = turtle.next ;
            hare = hare.next.next ;
        }

        return turtle ;
    }

    public Node mergeSLL(Node head){
        //base case
        if(head == null || head.next == null){
            return head ;
        }

        //mid 
        Node mid = getMidNode(head);

        //lfth & rgth mergesort
        Node rightHead = mid.next ;

        //separating linkedlist
        mid.next = null ;

        Node newLeft = mergeSLL(head);
        Node newRight = mergeSLL(rightHead);

        //merge
        return merge(newLeft , newRight) ;
    }

    private Node merge(Node l , Node r){
        Node mergedLL = new Node (-1);
        Node tmp = mergedLL ;

        // comparing two partitions of list
        while(l != null && r != null){
            if(l.data <= r.data){
                tmp.next = l;
                l = l.next ;
                tmp = tmp.next ;
            }else {
                tmp.next = r;
                r = r.next ;
                tmp = tmp.next ;
            }
        }

        //left part > right
        while (l != null){
            tmp.next = l ;
            l = l.next ;
            tmp = tmp.next ;
        }

        //right part > right
        while (r != null){
            tmp.next = r ;
            r = r.next ;
            tmp = tmp.next ;
        }

        //merges list head
        return mergedLL.next ;
    }

    public void printll(MergeSortLL ll){//O(n)
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

        MergeSortLL ll = new MergeSortLL();

        //add
        ll.addLast(7);
        ll.addLast(6);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        

        ll.printll(ll);
        ll.head = ll.mergeSLL(ll.head);
        System.out.println("MergeSort Applied -> ");
        ll.printll(ll);
    }
}
