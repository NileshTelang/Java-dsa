import java.util.*;

class MaxLenChainOfPairs {

    public static void main(String[] args) { //O(n logn)
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        //lambda function 
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        //end time basis sorting
        int chainLen = 1;
        int chainEnd = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>=chainEnd){
                chainLen++;
               chainEnd=pairs[i][1];
            }
        }

        System.out.println("Max Length Of My Chain : "+chainLen);
        System.out.println();
    }
}