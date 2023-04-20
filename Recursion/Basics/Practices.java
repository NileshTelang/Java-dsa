

public class Practices {
    
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstOcc(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }

        if(key == arr[i]){
            return i;
        }
        return firstOcc(arr,key,i+1);
    }

    public static int lastOcc(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int tilingProb(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        // //vertical choice 
        // int tp1 =  tilingProb(n-1);

        // //horizontal choice
        // int tp2 = tilingProb(n-2);

        return tilingProb(n-1) + tilingProb(n-2);
    }

    public static void removeDuplicates(String str , int idx ,StringBuilder strbld, boolean map [] ){
        if(idx == str.length()){
            System.out.println("The String without duplicates : "+strbld);
            return ;
        }

        char currChar =  str.charAt(idx);
        if(map[currChar - 'a'] == true){ //currchar - 65 (a) = index in map array of [26]
            removeDuplicates(str, idx + 1, strbld, map);
        }else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, strbld.append(currChar), map);
        }
    }

    public static int friendPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // //choice 
        // //single
        // int fps = friendPairing(n-1);

        // //pair
        // int fpd = friendPairing(n-2);    
        // int pairways = (n-1) * fpd ; 

        return friendPairing(n-1) + (n-1) * friendPairing(n-2);
    }

    public static void printBinStrings(int n,int lastPlace , String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        printBinStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    

    public static void main(String[] args) {
        int arr [] = { 1 , 2 , 3 , 4 , 4};
        System.out.println(isSorted(arr, 0));
        System.out.println(firstOcc(arr, 4, 0));
        System.out.println(lastOcc(arr, 4, 0));
        System.out.println("Total Ways to Tile a floor with length 7 Is - "+tilingProb(7)+"\n");
        String str = "aabbcdeefghiijkllmmnopqqqqrstuvwxyaksjhz";
        removeDuplicates(str, 0,new StringBuilder(""), new boolean [26]);
        System.out.println(friendPairing(3));
        printBinStrings(3, 0, "");
    }
}
