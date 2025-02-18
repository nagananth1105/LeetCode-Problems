class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1 ;k<n;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==target-1 ||sum==target+1 || sum==target)
                    return sum;
                }
            }
        }
        return -1;
    }
}