

public class Subset { //Subset count = 2^n  , O(n)

    public static void findSubset(String str,String ans,int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("\'NULL\'  ");
            }else
                System.out.print("\'"+ans+"\'  ");
            return;
        }

        //recursion+backtracking
        //No choice
        findSubset(str, ans, i+1);

        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);

    }
    
    public static void main(String[] args) {
        String str = "abc";
        String subset = "";
        System.out.print("Subsets -> ");
        findSubset(str, subset, 0);
    }
}
