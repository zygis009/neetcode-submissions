class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int currMin = Integer.MAX_VALUE;
        for (int price : prices) {
            currMin = Math.min(currMin, price);
            profit = Math.max(profit, price - currMin);
        }
        return profit;
    }
}
