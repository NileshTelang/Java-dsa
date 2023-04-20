public class BuySell {

    public static int buySellProfit(int pr[]){
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        int n = pr.length;

        //sell
        for(int i=0; i<n ;i++){
            if(buyPrice < pr[i]){
                int profit = pr[i] - buyPrice ;
                MaxProfit = Math.max(MaxProfit , profit);
            }
            else{
                buyPrice = pr[i];
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        int prices [] = { 77 , 55 , 41 , 31 , 99 , 24};
        System.out.println("The Max Profit that can be earned Is - "+ buySellProfit(prices));
    }
}
