

import java.util.LinkedList;

public class RemoeNfromEnd {

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

    
    public static void removeNthFromEnd(int idx){
        //size calculate
        int sz = 0 ;
        Node temp = head  ;
        while(temp != null ){
            temp = temp.next; 
            sz++;
        }

        //idx == size
        if(idx == sz){
            head = head.next;
            return ;
        }


        //sz-idx
        int i = 1 ;
        int itofind = sz-idx;
        Node prev = head;
        while(i < itofind){
            prev = prev.next ;
            i++;
        }

        //i = idx-1
        prev.next = prev.next.next ;
        return;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList() ;

        addAtLast(1);
        addAtLast(2);
        addAtLast(3);
        addAtLast(2);
        addAtLast(1);

        printll(ll);
        System.out.println("Size - "+size);
        removeNthFromEnd(1);
        printll(ll);
    }
}

