import java.util.ArrayList;

public class MultiDArrayList {
    
    public static void main(String[] args) {
        ArrayList <ArrayList <Integer> > mainlist = new ArrayList <> () ; //2D AL

        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();

        for(int i = 1;i<11;i++){
            list1.add(i*1);
            list2.add(i*5);
        }

        list2.remove(0);
        
        //2d Add Operation
        mainlist.add(list1);
        mainlist.add(list2);

        System.out.println(mainlist);
    }
}
