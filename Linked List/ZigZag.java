import javax.xml.transform.Source;

public class ZigZag {


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


    public void ZigZag (){
        //mid
        Node turtle = head;
        Node hare = head ;

        while(hare != null && hare.next != null){
            turtle = turtle.next ;
            hare = hare.next.next ;
        }

        Node mid = turtle ;

        //reverse 2 nd Half
        Node curr = mid.next ;
        mid.next = null ;
        Node prev = null ;
        Node next ;

        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }

        Node left = head ;
        Node right = prev ;
        Node nextL , nextR ;

        //alt merge - zigzag merge
        while(left != null && right != null){
            nextL = left.next ;
            left.next = right ;
            nextR = right.next ;
            right.next = nextL ;

            left = nextL ;
            right = nextR ;
        }

    }

    

    public void printll(ZigZag ll){//O(n)
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

        ZigZag ll = new ZigZag();

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
        System.out.println("Zig-Zag : ");
        ll.ZigZag();
        ll.printll(ll);
        
    }
}

