public class DivideNConquer {
    
    //sorted n rotated array search
    public static int searchSNR(int arr[] , int key , int si ,int ei){

        //base
        if(si > ei){
            return -1;
        }

        int mid = si + (ei - si)/2;//(si+ei)/2

        //mid == key
        if(arr[mid] == key){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a : key on left of mid
            if(arr[si] <= key && key <= arr[mid]){
                return searchSNR(arr, key, si, mid-1);
            }
            //case b : key on right of mid
            else {
                return searchSNR(arr, key, mid+1, ei);
            }
        }
        //mid on L2 //arr[si] > arr[mid]
        else{
            //case c : key on right of mid
            if(arr[mid] <= key && key <= arr[ei]){
                return searchSNR(arr, key, mid+1, ei);
            }
            //case d : key on left of mid
            else { 
                return searchSNR(arr, key, si ,mid-1);
            }
        }
    }
    public static void main(String Args[]){

        int arr [] = { 5 , 7 , 9 , 0 , 3};
        int key = 0;
        System.out.println("Key Found At - "+searchSNR(arr, key, 0, arr.length-1));

    }
}
