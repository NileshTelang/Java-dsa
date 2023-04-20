

public class CycleLL{

    static class Node {
        int data ;
        Node next ;

        public Node (int data) {
            this.data = data;
            this.next = null ;
        }
    }

    public static Node head ;
    public static Node tail ;


    public static boolean isCycle(){ //floyd's cycle checking algo
        Node turtle = head ;
        Node hare = head ;

        while(hare != null && hare.next != null){
            turtle = turtle.next;
            hare = hare.next.next;
            if(turtle == hare){
                return true;
            }
        }

        return false;

    }

    public static void removeCycle(){
        //isCycle
        Node turtle = head;
        Node hare = head ;
        while(hare != null && hare.next != null){
            turtle = turtle.next;
            hare = hare.next.next;
            if(turtle == hare){
                System.out.println("Cycle Removed");
                break;
            }
        }

        //hare == null
        if(hare == null){
            return ;
        }

        //finding last node
        turtle = head ;
        Node prev = null ;
        while(turtle != hare){
            prev = hare ;
            turtle= turtle.next ;
            hare = hare.next ;
        }

        //lastnode.next == null
        prev.next = null ;
        
    }

    public static void main(String[] args) {

        head = new Node(1);
        Node temp = head.next = new Node(2);
        temp.next = new Node (3);
        temp.next.next = new Node (4);
        temp.next.next.next = temp;

        System.out.println("isCycle - "+isCycle());
        removeCycle();
        System.out.println("isCycle - "+isCycle());

    }
}