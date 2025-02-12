class Solution {
    public int maximumSum(int[] nums) {
        int max=-1;
        int n=nums.length;
        int[] Max = new int[100];

        for(int i=0;i<n;i++)
        {   
            int x=nums[i];
            int sum=0;
            while(x>0)
            {
                sum+=x%10;
                x=x/10;
            }
            if(Max[sum]!=0)
            {
                if(max<(nums[i]+Max[sum]))
                {
                    max=nums[i]+Max[sum];            
                }
                if(nums[i]>Max[sum])
                {
                    Max[sum]=nums[i];
                }
            }
            else
            {
                Max[sum]=nums[i];
            }        
        }
        return max;
    }
}