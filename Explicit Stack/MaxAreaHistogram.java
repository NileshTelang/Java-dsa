import java.util.Stack;

public class MaxAreaHistogram { //O(n)
    
    public static int maxAreaHisto(int arr[]){
        int maxArea = 0;
        int nsr[] = new int [arr.length];
        int nsl[] = new int [arr.length];

        //nsr
        Stack < Integer > s = new Stack<>();
        for(int i = arr.length-1; i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }
        //nsl
        s = new Stack<>();
        for(int i = 0 ; i<arr.length ;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        //curr area
        for(int i = 0;i <arr.length ;i++){
            int h = arr[i];
            int w = nsr[i] - nsl[i] -1;
            int currArea = h*w;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
    
    public static void main(String[] args) {
        int height [] = {2 , 1 , 5 , 6 , 2 , 3};
        System.out.println("Max Area Of Given Histogram - "+maxAreaHisto(height));
    }
}
