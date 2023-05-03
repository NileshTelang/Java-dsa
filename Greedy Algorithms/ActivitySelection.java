import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

class ActivitySelection {
     
    public static void main(String []args){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sorting
        int actvts[][] = new int[start.length][3];
        for(int i=0; i<start.length;i++){
            actvts[i][0] = i ;
            actvts[i][1] = start[i] ;
            actvts[i][2] = end[i] ;
        }

        //lambda function 
        Arrays.sort(actvts,Comparator.comparingDouble(o -> o[2]));

        //end time basis sorting
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st act
        maxAct = 1 ;
        ans.add(actvts[0][0]);
        int lastEnd = actvts[0][2];
        for(int i=1;i<end.length;i++){
            if(actvts[i][1]>=lastEnd){
                maxAct++;
                ans.add(actvts[i][0]);
                lastEnd=actvts[i][2];
            }
        }

        System.out.println("Max Activities Possible : "+maxAct);
        for(int i=0 ;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+"   ");
        }
        System.out.println();

    }
}