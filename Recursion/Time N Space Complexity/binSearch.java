

public class binSearch { // O(log n)
    
    public static int BinSearch(int arr[] ,int n){
        int start=0;int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(n == arr[mid]){
                return mid;
            }
            else if (n < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array [] = {1,3,5,7,9,11};
        int key = 9;
        System.out.println("Number Found At : "+BinSearch(array, key));
    }
}
