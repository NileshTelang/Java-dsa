//modular arithmetics -> circular traversal
//right > (i + 1)%n
//left  < (n+i-1)%n 

import java.util.ArrayList;
import java.util.Collections;

public class PairSumAL {

    //brute force - O(n^2)
    public static boolean pairSum(ArrayList <Integer> list , int target){
    
        for(int i = 0; i< list.size() ; i++){
            for(int j = i+1 ; j<list.size();j++){
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }

        return false ;
    }

    //2pointer approach - O(n) 
    public static boolean pairSum2(ArrayList <Integer> list , int target){
        int lp = 0;
        int rp = list.size()-1;
        
        while(lp != rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }else if(list.get(lp)<list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        return false;
    }

    //2pointer with sorted nd rotated ARRAYLIST 
    public static boolean pairSum3(ArrayList <Integer> list , int target){
        int mid = -1;
        int n = list.size();
        for(int i = 0; i<n;i++){
            if(list.get(i) > list.get(i+1)){
                mid = i;
                break;
            }
        }
        int lp = mid+1;
        int rp = mid;
        
        while(lp != rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }else if( ( list.get(lp) + list.get(rp) ) < target ){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0 ; i< 7;i++){
            list.add(i+1);
        }
        System.out.println(list);
        System.out.println();
        System.out.println("Brute Force - ");
        System.out.println(pairSum(list,13));

        System.out.println("2 pointer approach - ");
        Collections.sort(list);
        System.out.println(pairSum2(list,14));
        System.out.println(pairSum2(list,13)); //6+7

        ArrayList <Integer> snrlist = new ArrayList<>();
        snrlist.add(5);
        snrlist.add(6);
        snrlist.add(7);
        snrlist.add(0);
        snrlist.add(1);
        snrlist.add(2);
        snrlist.add(3);
        snrlist.add(4);
        System.out.println("2 pointer approach w SNR List - ");
        System.out.println(pairSum3(snrlist,13));
        System.out.println(pairSum3(snrlist,14));
    }
}
