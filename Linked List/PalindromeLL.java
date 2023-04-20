import java.util.LinkedList;

public class PalindromeLL {

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
    
    public static Node findMid(Node head){//slow-fast approach
        Node turtle = head ;
        Node hare = head ;

        while(hare != null && hare.next != null){
            turtle = turtle.next ;
            hare = hare.next.next ;
        }

        //turtle at midNode
        return turtle ;
    }

    //palindrome case
    public static boolean isPalindrome() {
        //base case 
        if(head == null || head.next == null){
            return true;    
        }

        //find midNode
        Node minNode = findMid(head);

        //reverse half
        Node prev = null ;
        Node curr = minNode ;
        Node next ;
        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }

        //left half == right half

        Node right = prev ;
        Node left = head ;
        while(right != null){
            if(left.data != right.data){
                return false ;
            }
            left = left.next;
            right = right.next ;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList() ;

        addAtLast(1);
        addAtLast(2);
        addAtLast(3);
        addAtLast(2);
        addAtLast(1);
        printll(ll);

        System.out.println(isPalindrome());

    }
}
