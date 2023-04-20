

public class ArrayBT {

    public static void backTracking(int arr[],int i , int val){

        //base case
        if(i == arr.length){
            print(arr); //recursive array
            return;
        }

        //recursion
        arr[i] = val;
        backTracking(arr, i+1, val+1);
        arr[i] = arr[i] - 2; //backtracking
    }

    public static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] =  new int[5];
        backTracking(arr,0,1);
        print(arr); //backtracked array
    }
}