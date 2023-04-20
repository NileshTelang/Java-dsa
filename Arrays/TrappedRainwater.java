public class TrappedRainwater {

    public static int trapRain(int hgt[]){
        int n = hgt.length;
        //Left-Max Boundary
        int lmb [] = new int [n];
        lmb[0] = hgt[0];
        for(int i=1;i<n;i++){
            lmb[i] = Math.max(hgt[i],lmb[i-1]);
        }
        //Right-Max Boundary
        int rmb [] = new int [n];
        rmb[n-1]=hgt[n-1];
        for(int i=n-2;i>=0;i--){
            rmb[i]=Math.max(hgt[i],rmb[i+1]);
        }
        //Loop
        int TrappedRainwater = 0;
        for(int i=0;i<n;i++){
            //Waterlevel = min (lmb , rmb)
            int waterlevel = Math.min(lmb[i] , rmb[i]);
            TrappedRainwater += waterlevel - hgt[i]; 
        }
        
        return TrappedRainwater;
    }

    public static void main(String[] args) {
        int Heights [] = { 0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("The Total Trapped RAINWATER Is - " + trapRain(Heights) );

    }
}
