public class RevArray {

    public static void revArray(int arr[]) {
        int first = 0,last = arr.length-1; 
        while(first<last){
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12};
        System.out.print("The Reversed Array Is - ");
        revArray(array);
        
    }
}
