

class Permutations{//permutations for n = n!

    static int count = 0; 

    public static void findPermutations(String str, String ans){
        //base 
        if(str.length() == 0){
            System.out.println(ans+" ");
            count++;
            return;
        }

        //recursion - O (n * n! )
        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);
            //abcde = "ab" + "de" -> abde
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(newStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "DRDO";
        String permutations = "";
        findPermutations(str, permutations);
        System.out.println(count);
    }
}