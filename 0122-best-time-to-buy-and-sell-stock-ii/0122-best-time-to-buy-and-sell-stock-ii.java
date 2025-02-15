class Solution {
    public int maxProfit(int[] prices) {
        int sum =0;
        for(int i=1;i<prices.length;i++){
            int x =prices[i]-prices[i-1];
            if(x>0){
                sum=sum+x;
            }
        }
        return sum;
    }
}