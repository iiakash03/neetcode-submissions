class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit=0;
        int left=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){

            if(prices[i]<left){
                left=prices[i];
            }else{
                maxProfit=Math.max(maxProfit,prices[i]-left);
            }

        }
        
        return maxProfit;
    }
}
