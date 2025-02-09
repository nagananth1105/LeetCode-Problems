class Solution {
    public long countBadPairs(int[] nums) {
        long count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((long)j - (long)i != (long)nums[j] - (long)nums[i]) {
                    count++;
                }
            }
        }

        return count;
    }
}
