class Solution {
    public int maxProfit(int[] prices) {

        int max= 0;
        int minTillNow = prices[0];
        for(int i=0;i<prices.length;i++){
            max = Math.max(max, prices[i]-minTillNow);
            minTillNow = Math.min(prices[i], minTillNow);
        } 
        
        return max;
    }
}