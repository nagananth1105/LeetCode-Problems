class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int countp =0;
        int countn=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                countp++;
            }
            else if(nums[i]<0){
                countn++;
            }
        }
        if(countp>countn){
            return countp;
        }
        return countn;
    }
}