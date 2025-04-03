class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0; 
        int maxPrefix = nums[0];  
        long maxTripletValue = 0;
        for (int j = 1; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                long tripletValue = (long) (maxPrefix - nums[j]) * nums[k];
                maxTripletValue = Math.max(maxTripletValue, tripletValue);
            }
            maxPrefix = Math.max(maxPrefix, nums[j]);
        }

        return maxTripletValue;
    }
}
