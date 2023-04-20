import java.util.ArrayList;
import java.util.Collections;

public class BasicSyn{

    public static void swap(ArrayList <Integer> list , int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1 , list.get(idx2)); //set operation
        list.set(idx2 , temp);
    }

    public static void main(String[] args) {
        System.out.println("ArrayList\n");

        //-dynamic size 
        //-primitive datatype can not store directly

        //declaration
        ArrayList <Integer> list = new ArrayList<>(); //Integer class name for datatype int

        //add operation
        list.add(1); //O(1)
        list.add(2);
        list.add(11);
        list.add(5);
        list.add(6);
        
        //add element at index x
        list.add(3 , 4); //O(n)

        System.out.println(list);

        //get operation
        System.out.println(list.get(3)); //O(1)

        //remove operation
        list.remove(5); //O(n)
        System.out.println(list);

        //contains operation
        System.out.println(list.contains(5));
        System.out.println(list.contains(6));

        //size method
        System.out.println(list.size());

        //reverse the list
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //max element
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max , list.get(i));
        }

        System.out.println("Max Element > "+max);

        //swap method
        System.out.println(list);
        swap(list,1,4);
        System.out.println(list);

        //sort - inbuilt
        System.out.println("Sorted -> ");
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);

    }
}