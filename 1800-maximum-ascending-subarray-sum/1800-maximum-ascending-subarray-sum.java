class Solution {
    public int maxAscendingSum(int[] nums) {
        int res = 0;
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                res = Math.max(res, sum);
                sum = nums[i];
            }
        }
        res = Math.max(res, sum);
        return res;
    }
}