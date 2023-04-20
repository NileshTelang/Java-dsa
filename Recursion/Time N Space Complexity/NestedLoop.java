

public class NestedLoop {
    
    public static void main(String[] args) {
        
        int n = 25;
        int k = 5;

        for(int i = 0;i<n;i= i+k){ // 25 normally
            for(int j = i+1 ;j<=k;j++){ // 25/ 5 i.e. n/k logically
                System.out.print("Nova ");
            }
        }
    }
}
