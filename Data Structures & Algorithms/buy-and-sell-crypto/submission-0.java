class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxprof = 0;

        while(r<prices.length){
            if(prices[l]<prices[r]){
                int prof = prices[r] - prices[l];
                maxprof = Math.max(maxprof, prof);
            }else{
                l = r;
            }
            r++;
        }
        return maxprof;
    }
}
