import java.util.ArrayList;

public class ContainerwMW {

    //brute force approach - O (n^2)
    public static int containerwMW(ArrayList <Integer> ht ){
        int maxWater = 0 ;

        for(int i = 0; i< ht.size() ;i++){
            for(int j = i+1 ; j < ht.size();j++){
                int lenOfCon = Math.min(ht.get(i) , ht.get(j));
                int widOfCon = j - i ;
                maxWater = Math.max(maxWater , (lenOfCon * widOfCon) );
            }
        }
        return maxWater ;
    }

    //2 pointer approach 
    public static int containerwMW2(ArrayList <Integer> ht ){
        int maxWater = 0 ;
        int lp = 0 ;
        int rp = ht.size() - 1 ;

        while (lp < rp){
            int lenOfCon = Math.min(ht.get(lp) , ht.get(rp));
            int widOfCon = rp - lp ;
            maxWater = Math.max(maxWater , (lenOfCon * widOfCon) );
            if(ht.get(lp) < ht.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater ;
    }
    
    public static void main(String[] args) {
        ArrayList <Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("The Max Water Stored - "+containerwMW(height));
        System.out.println("The Max Water Stored 2p - "+containerwMW(height));
    }
}
