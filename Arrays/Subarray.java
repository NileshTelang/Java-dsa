public class Subarray {
    
    public static void maxofSubArray(int array[]){
        int SubA = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i< array.length;i++){
            for(int j = i ; j<array.length;j++){
                int curSum=0;
                System.out.print(" [");
                for(int k=i;k<=j;k++){
                    System.out.print(" "+array[k] );
                    curSum +=array[k];
                }
                System.out.print(" ]  =  "+curSum);
                if(curSum>maxSum){
                    maxSum = curSum;
                }
                SubA++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = "+SubA+"\nMaximum Sum Of a SubArray - "+maxSum);
    }

    
    public static void main(String[] args) {
        int array [] = {-4,-4,-1};
        maxofSubArray(array);
    }
}
