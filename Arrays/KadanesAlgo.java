public class KadanesAlgo {
    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs += arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(ms,cs);
            if(ms==0){
                ms += arr[i];
            }
        }
        System.out.println("Max Of Given Array with kadanes Algorithm : "+ms);
    }
    public static void main(String[] args) {
        int array [] = {-4,-4,-1};
        kadanes(array);
    }
}
