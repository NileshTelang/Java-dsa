

import java.util.Stack;

public class NextGreaterElementProb {

    public static void nxtGtrProb(int arr[] , int nxtGtr []){
        Stack < Integer > s = new Stack<>();
        for(int i = arr.length-1; i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGtr[i] = -1;
            }else {
                nxtGtr[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }
    
    public static void main(String[] args) {
        int arr [] = { 100 , 80 , 60 , 70 , 60 , 85 , 100};
        int nxtGtr [] = new int [arr.length];
        nxtGtrProb(arr , nxtGtr);
        for(int i = 0;i<nxtGtr.length;i++){
            System.out.print(nxtGtr[i]+" ");
        }
    }
}

