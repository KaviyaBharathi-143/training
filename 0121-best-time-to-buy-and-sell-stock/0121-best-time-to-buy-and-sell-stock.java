class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int bestBuy=prices[0];
        for(int i=1; i<prices.length;i++){
            int curr_price=prices[i];
            if(curr_price>bestBuy){
                profit=Math.max(profit,curr_price-bestBuy);
            }
            if(curr_price<bestBuy){
                bestBuy=curr_price;
            }
        }
        return profit;
        
    }
}